package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RotateTopRight: ImageVector
    get() {
        if (_rotateTopRight != null) {
            return _rotateTopRight!!
        }
        _rotateTopRight = ImageVector.Builder(
            name = "RotateTopRight",
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
        moveTo(7f, 15f)
        curveTo(7f, 18.2998f, 7f, 19.9497f, 8.02513f, 20.9749f)
        curveTo(9.05025f, 22f, 10.7002f, 22f, 14f, 22f)
        curveTo(17.2998f, 22f, 18.9497f, 22f, 19.9749f, 20.9749f)
        curveTo(21f, 19.9497f, 21f, 18.2998f, 21f, 15f)
        curveTo(21f, 11.7002f, 21f, 10.0503f, 19.9749f, 9.02513f)
        curveTo(18.9497f, 8f, 17.2998f, 8f, 14f, 8f)
        curveTo(10.7002f, 8f, 9.05025f, 8f, 8.02513f, 9.02513f)
        curveTo(7f, 10.0503f, 7f, 11.7002f, 7f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.57987f, 2f)
        lineTo(10.9256f, 3.11013f)
        curveTo(11.6419f, 3.70104f, 12f, 3.99649f, 12f, 4.36364f)
        lineTo(11f, 4.36364f)
        curveTo(7.22876f, 4.36364f, 5.34315f, 4.36364f, 4.17157f, 5.53521f)
        curveTo(3f, 6.70678f, 3f, 8.5924f, 3f, 12.3636f)
        verticalLineTo(13f)
        }
        }.build()

        return _rotateTopRight!!
    }

private var _rotateTopRight: ImageVector? = null
