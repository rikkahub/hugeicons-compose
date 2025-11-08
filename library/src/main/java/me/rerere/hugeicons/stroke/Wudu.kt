package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Wudu: ImageVector
    get() {
        if (_wudu != null) {
            return _wudu!!
        }
        _wudu = ImageVector.Builder(
            name = "Wudu",
            defaultWidth = 25.dp,
            defaultHeight = 24.dp,
            viewportWidth = 25f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5281f, 2f)
        lineTo(13.6469f, 4.97519f)
        curveTo(12.0996f, 6.60052f, 12.1264f, 9.21756f, 13.6736f, 10.8153f)
        curveTo(15.2476f, 12.4131f, 17.782f, 12.3856f, 19.3292f, 10.7878f)
        curveTo(20.9032f, 9.16248f, 20.8765f, 6.5454f, 19.3292f, 4.94762f)
        lineTo(16.5281f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.5f, 14f)
        horizontalLineTo(6.89482f)
        curveTo(7.18897f, 14f, 7.47908f, 14.0663f, 7.74217f, 14.1936f)
        lineTo(9.78415f, 15.1816f)
        curveTo(10.0472f, 15.3089f, 10.3373f, 15.3751f, 10.6315f, 15.3751f)
        horizontalLineTo(11.6741f)
        curveTo(12.6825f, 15.3751f, 13.5f, 16.1662f, 13.5f, 17.142f)
        curveTo(13.5f, 17.1814f, 13.473f, 17.2161f, 13.4338f, 17.2269f)
        lineTo(10.8929f, 17.9295f)
        curveTo(10.4371f, 18.0555f, 9.949f, 18.0116f, 9.525f, 17.8064f)
        lineTo(7.34211f, 16.7503f)
        moveTo(13.5f, 16.5f)
        lineTo(18.0928f, 15.0889f)
        curveTo(18.907f, 14.8352f, 19.7871f, 15.136f, 20.2971f, 15.8423f)
        curveTo(20.6659f, 16.3529f, 20.5157f, 17.0842f, 19.9785f, 17.3942f)
        lineTo(12.4629f, 21.7305f)
        curveTo(11.9849f, 22.0063f, 11.4209f, 22.0736f, 10.8952f, 21.9176f)
        lineTo(4.5f, 20.0199f)
        }
        }.build()

        return _wudu!!
    }

private var _wudu: ImageVector? = null
