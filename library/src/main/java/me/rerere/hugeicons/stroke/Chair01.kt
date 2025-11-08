package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Chair01: ImageVector
    get() {
        if (_chair01 != null) {
            return _chair01!!
        }
        _chair01 = ImageVector.Builder(
            name = "Chair01",
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
        moveTo(8f, 15f)
        lineTo(6f, 22f)
        moveTo(16f, 15f)
        lineTo(18f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 11f)
        curveTo(10.4783f, 11f, 8.86931f, 11.2925f, 7.60803f, 11.6838f)
        curveTo(6.6583f, 11.9784f, 5.89434f, 13.322f, 6.01199f, 14.4128f)
        curveTo(6.05558f, 14.8169f, 6.36877f, 15f, 6.69807f, 15f)
        horizontalLineTo(17.3019f)
        curveTo(17.6312f, 15f, 17.9444f, 14.8169f, 17.988f, 14.4128f)
        curveTo(18.1057f, 13.322f, 17.3417f, 11.9784f, 16.392f, 11.6838f)
        curveTo(15.1307f, 11.2925f, 13.5217f, 11f, 12f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 12f)
        lineTo(7.6398f, 5.60199f)
        curveTo(7.81099f, 3.89012f, 7.89658f, 3.03419f, 8.46796f, 2.51709f)
        curveTo(9.03935f, 2f, 9.89955f, 2f, 11.62f, 2f)
        horizontalLineTo(12.38f)
        curveTo(14.1005f, 2f, 14.9607f, 2f, 15.532f, 2.51709f)
        curveTo(16.1034f, 3.03419f, 16.189f, 3.89012f, 16.3602f, 5.60199f)
        lineTo(17f, 12f)
        }
        }.build()

        return _chair01!!
    }

private var _chair01: ImageVector? = null
