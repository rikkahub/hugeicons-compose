package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Asterisk: ImageVector
    get() {
        if (_asterisk != null) {
            return _asterisk!!
        }
        _asterisk = ImageVector.Builder(
            name = "Asterisk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 7.5f)
        verticalLineTo(16.5f)
        moveTo(15.8971f, 9.75f)
        lineTo(8.10289f, 14.25f)
        moveTo(15.897f, 14.25f)
        lineTo(8.10275f, 9.75f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.47867f, 6.76926f)
        curveTo(2.20958f, 10.8137f, 1.22078f, 16.4342f, 4.27013f, 19.323f)
        curveTo(6.87609f, 21.7918f, 11.5879f, 21.4667f, 15.5675f, 18.7956f)
        lineTo(20f, 20.5f)
        lineTo(18.0841f, 16.6688f)
        curveTo(21.8721f, 12.6801f, 22.6403f, 7.43426f, 19.7299f, 4.67697f)
        curveTo(16.6805f, 1.78811f, 10.7478f, 2.72486f, 6.47867f, 6.76926f)
        }
        }.build()

        return _asterisk!!
    }

private var _asterisk: ImageVector? = null
