package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FlipLeft: ImageVector
    get() {
        if (_flipLeft != null) {
            return _flipLeft!!
        }
        _flipLeft = ImageVector.Builder(
            name = "FlipLeft",
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
        moveTo(2f, 9.66676f)
        verticalLineTo(14.3334f)
        moveTo(7.5f, 3.01509f)
        curveTo(7.99962f, 2.99793f, 8.49991f, 2.99705f, 9f, 2.99855f)
        moveTo(7.5f, 20.9849f)
        curveTo(7.99962f, 21.0021f, 8.49991f, 21.003f, 9f, 21.0015f)
        moveTo(4.74533f, 3.53709f)
        curveTo(3.78698f, 4.02122f, 3.00864f, 4.80249f, 2.52818f, 5.76305f)
        moveTo(2.5f, 18.1797f)
        curveTo(2.9779f, 19.1665f, 3.76801f, 19.9692f, 4.74533f, 20.4629f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 5.5049f)
        curveTo(12f, 3.54683f, 12.6378f, 3.00683f, 14.5f, 3.00683f)
        curveTo(17.0317f, 3.00683f, 19.9537f, 2.7569f, 21.3971f, 5.25509f)
        curveTo(22f, 6.29851f, 22f, 7.69935f, 22f, 10.501f)
        verticalLineTo(13.4987f)
        curveTo(22f, 16.3004f, 22f, 17.7012f, 21.3971f, 18.7447f)
        curveTo(19.9537f, 21.2429f, 17.0317f, 20.9929f, 14.5f, 20.9929f)
        curveTo(12.6378f, 20.9929f, 12f, 20.4529f, 12f, 18.4949f)
        verticalLineTo(5.5049f)
        }
        }.build()

        return _flipLeft!!
    }

private var _flipLeft: ImageVector? = null
