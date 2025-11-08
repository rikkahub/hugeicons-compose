package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CloudAngledZap: ImageVector
    get() {
        if (_cloudAngledZap != null) {
            return _cloudAngledZap!!
        }
        _cloudAngledZap = ImageVector.Builder(
            name = "CloudAngledZap",
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
        moveTo(7f, 17.5f)
        curveTo(4.23858f, 17.5f, 2f, 15.336f, 2f, 12.6667f)
        curveTo(2f, 10.1537f, 3.98398f, 8.0886f, 6.52042f, 7.85528f)
        moveTo(17.5f, 17.5f)
        curveTo(19.9853f, 17.5f, 22f, 15.5524f, 22f, 13.15f)
        curveTo(22f, 10.7476f, 19.9853f, 8.8f, 17.5f, 8.8f)
        curveTo(17.4925f, 8.8f, 17.485f, 8.80002f, 17.4776f, 8.80005f)
        moveTo(17.4776f, 8.80005f)
        curveTo(17.4924f, 8.64084f, 17.5f, 8.47961f, 17.5f, 8.31667f)
        curveTo(17.5f, 5.38035f, 15.0376f, 3f, 12f, 3f)
        curveTo(9.12324f, 3f, 6.76233f, 5.135f, 6.52042f, 7.85528f)
        moveTo(17.4776f, 8.80005f)
        curveTo(17.3753f, 9.89668f, 16.9286f, 10.8973f, 16.2428f, 11.7f)
        moveTo(6.52042f, 7.85528f)
        curveTo(6.67826f, 7.84076f, 6.83823f, 7.83333f, 7f, 7.83333f)
        curveTo(8.12582f, 7.83333f, 9.16474f, 8.19302f, 10.0005f, 8.8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5784f, 14f)
        lineTo(10.8043f, 16.6838f)
        curveTo(10.5668f, 17.0431f, 10.4481f, 17.2227f, 10.5217f, 17.3614f)
        curveTo(10.5952f, 17.5f, 10.8093f, 17.5f, 11.2375f, 17.5f)
        horizontalLineTo(12.7625f)
        curveTo(13.1907f, 17.5f, 13.4048f, 17.5f, 13.4783f, 17.6386f)
        curveTo(13.5519f, 17.7773f, 13.4332f, 17.9569f, 13.1957f, 18.3162f)
        lineTo(11.4216f, 21f)
        }
        }.build()

        return _cloudAngledZap!!
    }

private var _cloudAngledZap: ImageVector? = null
