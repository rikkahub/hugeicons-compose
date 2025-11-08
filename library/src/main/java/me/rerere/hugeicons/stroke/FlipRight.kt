package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FlipRight: ImageVector
    get() {
        if (_flipRight != null) {
            return _flipRight!!
        }
        _flipRight = ImageVector.Builder(
            name = "FlipRight",
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
        moveTo(22f, 9.66676f)
        verticalLineTo(14.3334f)
        moveTo(16.5f, 3.01509f)
        curveTo(16.0004f, 2.99793f, 15.5001f, 2.99705f, 15f, 2.99855f)
        moveTo(16.5f, 20.9849f)
        curveTo(16.0004f, 21.0021f, 15.5001f, 21.003f, 15f, 21.0015f)
        moveTo(19.2547f, 3.53709f)
        curveTo(20.213f, 4.02122f, 20.9914f, 4.80249f, 21.4718f, 5.76305f)
        moveTo(21.5f, 18.1797f)
        curveTo(21.0221f, 19.1665f, 20.232f, 19.9692f, 19.2547f, 20.4629f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 5.5049f)
        curveTo(12f, 3.54683f, 11.3622f, 3.00683f, 9.5f, 3.00683f)
        curveTo(6.96832f, 3.00683f, 4.04633f, 2.7569f, 2.60289f, 5.25509f)
        curveTo(2f, 6.29851f, 2f, 7.69935f, 2f, 10.501f)
        verticalLineTo(13.4987f)
        curveTo(2f, 16.3004f, 2f, 17.7012f, 2.60289f, 18.7447f)
        curveTo(4.04633f, 21.2429f, 6.96832f, 20.9929f, 9.5f, 20.9929f)
        curveTo(11.3622f, 20.9929f, 12f, 20.4529f, 12f, 18.4949f)
        verticalLineTo(5.5049f)
        }
        }.build()

        return _flipRight!!
    }

private var _flipRight: ImageVector? = null
