package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RotateBottomLeft: ImageVector
    get() {
        if (_rotateBottomLeft != null) {
            return _rotateBottomLeft!!
        }
        _rotateBottomLeft = ImageVector.Builder(
            name = "RotateBottomLeft",
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
        moveTo(2f, 10f)
        curveTo(2f, 13.2998f, 2f, 14.9497f, 3.02513f, 15.9749f)
        curveTo(4.05025f, 17f, 5.70017f, 17f, 9f, 17f)
        curveTo(12.2998f, 17f, 13.9497f, 17f, 14.9749f, 15.9749f)
        curveTo(16f, 14.9497f, 16f, 13.2998f, 16f, 10f)
        curveTo(16f, 6.70017f, 16f, 5.05025f, 14.9749f, 4.02513f)
        curveTo(13.9497f, 3f, 12.2998f, 3f, 9f, 3f)
        curveTo(5.70017f, 3f, 4.05025f, 3f, 3.02513f, 4.02513f)
        curveTo(2f, 5.05025f, 2f, 6.70017f, 2f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 14.4201f)
        lineTo(20.8899f, 13.0744f)
        curveTo(20.299f, 12.3581f, 20.0035f, 12f, 19.6364f, 12f)
        verticalLineTo(13f)
        curveTo(19.6364f, 16.7712f, 19.6364f, 18.6569f, 18.4648f, 19.8284f)
        curveTo(17.2932f, 21f, 15.4076f, 21f, 11.6364f, 21f)
        horizontalLineTo(11f)
        }
        }.build()

        return _rotateBottomLeft!!
    }

private var _rotateBottomLeft: ImageVector? = null
