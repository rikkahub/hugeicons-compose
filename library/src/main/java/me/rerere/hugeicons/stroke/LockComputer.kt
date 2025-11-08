package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LockComputer: ImageVector
    get() {
        if (_lockComputer != null) {
            return _lockComputer!!
        }
        _lockComputer = ImageVector.Builder(
            name = "LockComputer",
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
        moveTo(12.9994f, 2f)
        horizontalLineTo(9.99936f)
        curveTo(6.22812f, 2f, 4.34251f, 2f, 3.17093f, 3.17157f)
        curveTo(1.99936f, 4.34315f, 1.99936f, 6.22876f, 1.99936f, 10f)
        curveTo(1.99936f, 13.7712f, 1.99936f, 15.6569f, 3.17093f, 16.8284f)
        curveTo(4.34251f, 18f, 6.22812f, 18f, 9.99936f, 18f)
        horizontalLineTo(13.9994f)
        curveTo(17.7706f, 18f, 19.6563f, 18f, 20.8278f, 16.8284f)
        curveTo(21.481f, 16.1752f, 21.77f, 15.3001f, 21.8979f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9994f, 18f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.99936f, 22f)
        horizontalLineTo(15.9994f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.9994f, 15f)
        horizontalLineTo(12.9994f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.7501f, 5.37603f)
        curveTo(16.7501f, 5.31603f, 16.7487f, 4.55715f, 16.7501f, 4.12257f)
        curveTo(16.7514f, 3.72548f, 16.7165f, 3.34257f, 16.9061f, 2.99217f)
        curveTo(17.6165f, 1.57857f, 19.6565f, 1.72257f, 20.1605f, 3.16257f)
        curveTo(20.2478f, 3.39964f, 20.2531f, 3.77549f, 20.2505f, 4.12257f)
        curveTo(20.2472f, 4.56606f, 20.2565f, 5.37603f, 20.2565f, 5.37603f)
        moveTo(16.7501f, 5.37603f)
        curveTo(15.6701f, 5.37603f, 15.2165f, 6.15603f, 15.0965f, 6.63603f)
        curveTo(14.9765f, 7.11603f, 14.9765f, 8.85603f, 15.0485f, 9.57603f)
        curveTo(15.2885f, 10.476f, 15.8885f, 10.848f, 16.4765f, 10.968f)
        curveTo(17.0165f, 11.016f, 19.2965f, 10.998f, 19.9565f, 10.998f)
        curveTo(20.9165f, 11.016f, 21.6365f, 10.656f, 21.9365f, 9.57603f)
        curveTo(21.9965f, 9.21603f, 22.0565f, 7.23603f, 21.9065f, 6.63603f)
        curveTo(21.5885f, 5.67603f, 20.8565f, 5.37603f, 20.2565f, 5.37603f)
        moveTo(16.7501f, 5.37603f)
        horizontalLineTo(20.2565f)
        }
        }.build()

        return _lockComputer!!
    }

private var _lockComputer: ImageVector? = null
