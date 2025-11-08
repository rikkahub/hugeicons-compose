package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PunchingBall01: ImageVector
    get() {
        if (_punchingBall01 != null) {
            return _punchingBall01!!
        }
        _punchingBall01 = ImageVector.Builder(
            name = "PunchingBall01",
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
        moveTo(12.002f, 22f)
        curveTo(8.4121f, 22f, 5.50195f, 19.8177f, 5.50195f, 16.5095f)
        curveTo(5.50195f, 13.6609f, 7.9118f, 11.6468f, 9.27297f, 7.95509f)
        curveTo(9.4458f, 7.48634f, 9.53222f, 7.25196f, 9.59859f, 7.1298f)
        curveTo(9.95355f, 6.47644f, 10.4553f, 6.14521f, 11.2407f, 6.04564f)
        curveTo(11.7205f, 5.98482f, 12.2832f, 5.98478f, 12.7629f, 6.04554f)
        curveTo(13.5485f, 6.14503f, 14.0503f, 6.47626f, 14.4054f, 7.12968f)
        curveTo(14.4717f, 7.25185f, 14.5582f, 7.48626f, 14.731f, 7.95508f)
        curveTo(16.0922f, 11.6466f, 18.502f, 13.6606f, 18.502f, 16.5092f)
        curveTo(18.502f, 19.8174f, 15.5918f, 22f, 12.002f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.95495f, 14f)
        curveTo(8.93192f, 15.7778f, 9.65332f, 22f, 12.0009f, 22f)
        curveTo(14.3463f, 22f, 15.0741f, 15.7778f, 14.0487f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 6f)
        verticalLineTo(3.5f)
        moveTo(12f, 3.5f)
        lineTo(12.9153f, 3.27116f)
        curveTo(13.6038f, 3.09905f, 14.1826f, 2.63471f, 14.5f, 2f)
        moveTo(12f, 3.5f)
        lineTo(11.0847f, 3.27116f)
        curveTo(10.3962f, 3.09905f, 9.81735f, 2.63471f, 9.5f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.002f, 9f)
        horizontalLineTo(9.00195f)
        }
        }.build()

        return _punchingBall01!!
    }

private var _punchingBall01: ImageVector? = null
