package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Triangle02: ImageVector
    get() {
        if (_triangle02 != null) {
            return _triangle02!!
        }
        _triangle02 = ImageVector.Builder(
            name = "Triangle02",
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
        moveTo(19.4955f, 12.6324f)
        lineTo(19.8592f, 13.2648f)
        curveTo(21.5848f, 16.2653f, 22.4476f, 17.7656f, 21.7671f, 18.8828f)
        curveTo(21.0866f, 20f, 19.3099f, 20f, 15.7567f, 20f)
        horizontalLineTo(15f)
        moveTo(4.50453f, 12.6324f)
        lineTo(4.14082f, 13.2648f)
        curveTo(2.41522f, 16.2653f, 1.55242f, 17.7656f, 2.23293f, 18.8828f)
        curveTo(2.91344f, 20f, 4.69006f, 20f, 8.24328f, 20f)
        horizontalLineTo(9f)
        moveTo(7.5331f, 7.36631f)
        lineTo(7.89754f, 6.73262f)
        curveTo(9.71204f, 3.57754f, 10.6193f, 2f, 12f, 2f)
        curveTo(13.3807f, 2f, 14.288f, 3.57754f, 16.1025f, 6.73262f)
        lineTo(16.4669f, 7.36631f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 18f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.6602f, 9f)
        lineTo(16.1961f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.33984f, 9f)
        lineTo(7.80395f, 11f)
        }
        }.build()

        return _triangle02!!
    }

private var _triangle02: ImageVector? = null
