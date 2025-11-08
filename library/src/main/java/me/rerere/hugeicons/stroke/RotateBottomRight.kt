package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RotateBottomRight: ImageVector
    get() {
        if (_rotateBottomRight != null) {
            return _rotateBottomRight!!
        }
        _rotateBottomRight = ImageVector.Builder(
            name = "RotateBottomRight",
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
        moveTo(15f, 17f)
        curveTo(18.2998f, 17f, 19.9497f, 17f, 20.9749f, 15.9749f)
        curveTo(22f, 14.9497f, 22f, 13.2998f, 22f, 10f)
        curveTo(22f, 6.70017f, 22f, 5.05025f, 20.9749f, 4.02513f)
        curveTo(19.9497f, 3f, 18.2998f, 3f, 15f, 3f)
        curveTo(11.7002f, 3f, 10.0503f, 3f, 9.02513f, 4.02513f)
        curveTo(8f, 5.05025f, 8f, 6.70017f, 8f, 10f)
        curveTo(8f, 13.2998f, 8f, 14.9497f, 9.02513f, 15.9749f)
        curveTo(10.0503f, 17f, 11.7002f, 17f, 15f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 14.4201f)
        lineTo(3.11013f, 13.0744f)
        curveTo(3.70104f, 12.3581f, 3.99649f, 12f, 4.36364f, 12f)
        lineTo(4.36364f, 13f)
        curveTo(4.36364f, 16.7712f, 4.36364f, 18.6569f, 5.53521f, 19.8284f)
        curveTo(6.70678f, 21f, 8.5924f, 21f, 12.3636f, 21f)
        lineTo(13f, 21f)
        }
        }.build()

        return _rotateBottomRight!!
    }

private var _rotateBottomRight: ImageVector? = null
