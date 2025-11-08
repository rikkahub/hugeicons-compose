package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiCloud: ImageVector
    get() {
        if (_aiCloud != null) {
            return _aiCloud!!
        }
        _aiCloud = ImageVector.Builder(
            name = "AiCloud",
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
        moveTo(17.4776f, 9.00005f)
        curveTo(17.485f, 9.00002f, 17.4925f, 9f, 17.5f, 9f)
        curveTo(19.9853f, 9f, 22f, 11.0147f, 22f, 13.5f)
        curveTo(22f, 15.2415f, 21.0108f, 16.7519f, 19.5636f, 17.5f)
        moveTo(17.4776f, 9.00005f)
        curveTo(17.4924f, 8.83536f, 17.5f, 8.66856f, 17.5f, 8.5f)
        curveTo(17.5f, 5.46243f, 15.0376f, 3f, 12f, 3f)
        curveTo(9.12324f, 3f, 6.76233f, 5.20862f, 6.52042f, 8.0227f)
        moveTo(17.4776f, 9.00005f)
        curveTo(17.3753f, 10.1345f, 16.9286f, 11.1696f, 16.2428f, 12f)
        moveTo(6.52042f, 8.0227f)
        curveTo(3.98398f, 8.26407f, 2f, 10.4003f, 2f, 13f)
        curveTo(2f, 14.9791f, 3.14985f, 16.6896f, 4.81794f, 17.5f)
        moveTo(6.52042f, 8.0227f)
        curveTo(6.67826f, 8.00768f, 6.83823f, 8f, 7f, 8f)
        curveTo(8.12582f, 8f, 9.16474f, 8.37209f, 10.0005f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 14f)
        lineTo(12.2579f, 14.697f)
        curveTo(12.5961f, 15.611f, 12.7652f, 16.068f, 13.0986f, 16.4014f)
        curveTo(13.432f, 16.7348f, 13.889f, 16.9039f, 14.803f, 17.2421f)
        lineTo(15.5f, 17.5f)
        lineTo(14.803f, 17.7579f)
        curveTo(13.889f, 18.0961f, 13.432f, 18.2652f, 13.0986f, 18.5986f)
        curveTo(12.7652f, 18.932f, 12.5961f, 19.389f, 12.2579f, 20.303f)
        lineTo(12f, 21f)
        lineTo(11.7421f, 20.303f)
        curveTo(11.4039f, 19.389f, 11.2348f, 18.932f, 10.9014f, 18.5986f)
        curveTo(10.568f, 18.2652f, 10.111f, 18.0961f, 9.19703f, 17.7579f)
        lineTo(8.5f, 17.5f)
        lineTo(9.19703f, 17.2421f)
        curveTo(10.111f, 16.9039f, 10.568f, 16.7348f, 10.9014f, 16.4014f)
        curveTo(11.2348f, 16.068f, 11.4039f, 15.611f, 11.7421f, 14.697f)
        lineTo(12f, 14f)
        }
        }.build()

        return _aiCloud!!
    }

private var _aiCloud: ImageVector? = null
