package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RotateTopLeft: ImageVector
    get() {
        if (_rotateTopLeft != null) {
            return _rotateTopLeft!!
        }
        _rotateTopLeft = ImageVector.Builder(
            name = "RotateTopLeft",
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
        moveTo(3f, 15f)
        curveTo(3f, 18.2998f, 3f, 19.9497f, 4.02513f, 20.9749f)
        curveTo(5.05025f, 22f, 6.70017f, 22f, 10f, 22f)
        curveTo(13.2998f, 22f, 14.9497f, 22f, 15.9749f, 20.9749f)
        curveTo(17f, 19.9497f, 17f, 18.2998f, 17f, 15f)
        curveTo(17f, 11.7002f, 17f, 10.0503f, 15.9749f, 9.02513f)
        curveTo(14.9497f, 8f, 13.2998f, 8f, 10f, 8f)
        curveTo(6.70017f, 8f, 5.05025f, 8f, 4.02513f, 9.02513f)
        curveTo(3f, 10.0503f, 3f, 11.7002f, 3f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.4201f, 2f)
        lineTo(13.0744f, 3.11013f)
        curveTo(12.3581f, 3.70104f, 12f, 3.99649f, 12f, 4.36364f)
        lineTo(13f, 4.36364f)
        curveTo(16.7712f, 4.36364f, 18.6569f, 4.36364f, 19.8284f, 5.53521f)
        curveTo(21f, 6.70678f, 21f, 8.59241f, 21f, 12.3636f)
        verticalLineTo(13f)
        }
        }.build()

        return _rotateTopLeft!!
    }

private var _rotateTopLeft: ImageVector? = null
