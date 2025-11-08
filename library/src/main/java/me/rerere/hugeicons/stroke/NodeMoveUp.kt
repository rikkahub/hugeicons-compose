package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.NodeMoveUp: ImageVector
    get() {
        if (_nodeMoveUp != null) {
            return _nodeMoveUp!!
        }
        _nodeMoveUp = ImageVector.Builder(
            name = "NodeMoveUp",
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
        moveTo(5.49609f, 8f)
        verticalLineTo(12.5f)
        moveTo(5.49609f, 12.5f)
        verticalLineTo(14f)
        curveTo(5.49609f, 16.8284f, 5.49609f, 18.2426f, 6.37411f, 19.1213f)
        curveTo(7.19879f, 19.9466f, 8.49556f, 19.9968f, 10.992f, 19.9998f)
        moveTo(5.49609f, 12.5f)
        horizontalLineTo(10.992f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.9912f, 12.5f)
        curveTo(10.9912f, 11.5572f, 10.9912f, 11.0858f, 11.2839f, 10.7929f)
        curveTo(11.5766f, 10.5f, 12.0476f, 10.5f, 12.9897f, 10.5f)
        curveTo(13.9318f, 10.5f, 14.4028f, 10.5f, 14.6955f, 10.7929f)
        curveTo(14.9882f, 11.0858f, 14.9882f, 11.5572f, 14.9882f, 12.5f)
        curveTo(14.9882f, 13.4428f, 14.9882f, 13.9142f, 14.6955f, 14.2071f)
        curveTo(14.4028f, 14.5f, 13.9318f, 14.5f, 12.9897f, 14.5f)
        curveTo(12.0476f, 14.5f, 11.5766f, 14.5f, 11.2839f, 14.2071f)
        curveTo(10.9912f, 13.9142f, 10.9912f, 13.4428f, 10.9912f, 12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.9912f, 20f)
        curveTo(10.9912f, 19.0572f, 10.9912f, 18.5858f, 11.2839f, 18.2929f)
        curveTo(11.5766f, 18f, 12.0476f, 18f, 12.9897f, 18f)
        curveTo(13.9318f, 18f, 14.4028f, 18f, 14.6955f, 18.2929f)
        curveTo(14.9882f, 18.5858f, 14.9882f, 19.0572f, 14.9882f, 20f)
        curveTo(14.9882f, 20.9428f, 14.9882f, 21.4142f, 14.6955f, 21.7071f)
        curveTo(14.4028f, 22f, 13.9318f, 22f, 12.9897f, 22f)
        curveTo(12.0476f, 22f, 11.5766f, 22f, 11.2839f, 21.7071f)
        curveTo(10.9912f, 21.4142f, 10.9912f, 20.9428f, 10.9912f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.99654f, 2f)
        horizontalLineTo(6.99428f)
        curveTo(8.80812f, 2f, 8.99278f, 3.10993f, 8.99278f, 5f)
        curveTo(8.99278f, 6.89007f, 8.80812f, 8f, 6.99428f, 8f)
        horizontalLineTo(3.99654f)
        curveTo(2.18271f, 8f, 1.99805f, 6.89007f, 1.99805f, 5f)
        curveTo(1.99805f, 3.10993f, 2.18271f, 2f, 3.99654f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.9933f, 11.089f)
        lineTo(19.4475f, 9.31639f)
        curveTo(19.6862f, 9.05001f, 19.8558f, 8.99948f, 20.004f, 9.00405f)
        moveTo(20.004f, 9.00405f)
        curveTo(20.1502f, 9.00857f, 20.2888f, 9.06707f, 20.4978f, 9.31639f)
        lineTo(22.0032f, 11.1003f)
        moveTo(20.004f, 9.00405f)
        lineTo(19.9813f, 17.2623f)
        curveTo(20.0523f, 18.1368f, 19.9319f, 19.8285f, 17.9844f, 20.0085f)
        }
        }.build()

        return _nodeMoveUp!!
    }

private var _nodeMoveUp: ImageVector? = null
