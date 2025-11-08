package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Chair03: ImageVector
    get() {
        if (_chair03 != null) {
            return _chair03!!
        }
        _chair03 = ImageVector.Builder(
            name = "Chair03",
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
        moveTo(7f, 12f)
        horizontalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 15f)
        horizontalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 6f)
        lineTo(6f, 22f)
        moveTo(16.5f, 6f)
        lineTo(18f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        curveTo(10.4783f, 2f, 8.86931f, 2.29246f, 7.60803f, 2.68377f)
        curveTo(6.6583f, 2.97841f, 5.89434f, 4.32201f, 6.01199f, 5.41276f)
        curveTo(6.05558f, 5.81688f, 6.36877f, 6f, 6.69807f, 6f)
        horizontalLineTo(17.3019f)
        curveTo(17.6312f, 6f, 17.9444f, 5.81688f, 17.988f, 5.41276f)
        curveTo(18.1057f, 4.32202f, 17.3417f, 2.97841f, 16.392f, 2.68377f)
        curveTo(15.1307f, 2.29246f, 13.5217f, 2f, 12f, 2f)
        }
        }.build()

        return _chair03!!
    }

private var _chair03: ImageVector? = null
