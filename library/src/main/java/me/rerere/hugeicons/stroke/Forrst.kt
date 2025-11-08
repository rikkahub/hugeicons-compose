package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Forrst: ImageVector
    get() {
        if (_forrst != null) {
            return _forrst!!
        }
        _forrst = ImageVector.Builder(
            name = "Forrst",
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
        moveTo(19.8592f, 14.2648f)
        lineTo(16.1025f, 7.73262f)
        curveTo(14.288f, 4.57754f, 13.3807f, 3f, 12f, 3f)
        curveTo(10.6193f, 3f, 9.71204f, 4.57754f, 7.89754f, 7.73262f)
        lineTo(4.14082f, 14.2648f)
        curveTo(2.41522f, 17.2653f, 1.55242f, 18.7656f, 2.23293f, 19.8828f)
        curveTo(2.91344f, 21f, 4.69006f, 21f, 8.24328f, 21f)
        horizontalLineTo(8.5f)
        curveTo(9.44281f, 21f, 9.91421f, 21f, 10.2071f, 20.7071f)
        curveTo(10.5f, 20.4142f, 10.5f, 19.9428f, 10.5f, 19f)
        verticalLineTo(13.5f)
        curveTo(10.5f, 12.9298f, 10.5023f, 12.3309f, 11.1173f, 12.0761f)
        curveTo(11.3011f, 12f, 11.5341f, 12f, 12f, 12f)
        curveTo(12.4659f, 12f, 12.6989f, 12f, 12.8827f, 12.0761f)
        curveTo(13.4977f, 12.3309f, 13.5f, 12.9298f, 13.5f, 13.5f)
        verticalLineTo(19f)
        curveTo(13.5f, 19.9428f, 13.5f, 20.4142f, 13.7929f, 20.7071f)
        curveTo(14.0858f, 21f, 14.5572f, 21f, 15.5f, 21f)
        horizontalLineTo(15.7567f)
        curveTo(19.3099f, 21f, 21.0866f, 21f, 21.7671f, 19.8828f)
        curveTo(22.4476f, 18.7656f, 21.5848f, 17.2653f, 19.8592f, 14.2648f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 19f)
        lineTo(16.5f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 15f)
        lineTo(15f, 13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 17f)
        lineTo(8f, 14.5f)
        }
        }.build()

        return _forrst!!
    }

private var _forrst: ImageVector? = null
