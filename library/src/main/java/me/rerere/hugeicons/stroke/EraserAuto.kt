package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.EraserAuto: ImageVector
    get() {
        if (_eraserAuto != null) {
            return _eraserAuto!!
        }
        _eraserAuto = ImageVector.Builder(
            name = "EraserAuto",
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
        moveTo(12.0352f, 12.0885f)
        lineTo(9.11997f, 15.0192f)
        curveTo(7.70666f, 16.44f, 7f, 17.1504f, 7f, 18.0354f)
        curveTo(7f, 18.9204f, 7.70666f, 19.6308f, 9.11997f, 21.0516f)
        lineTo(9.45083f, 21.3842f)
        curveTo(9.75311f, 21.6881f, 9.90425f, 21.84f, 10.0959f, 21.92f)
        curveTo(10.2875f, 22f, 10.5003f, 22f, 10.9261f, 22f)
        horizontalLineTo(13.1444f)
        curveTo(13.5701f, 22f, 13.7829f, 22f, 13.9746f, 21.92f)
        curveTo(14.1662f, 21.84f, 14.3173f, 21.6881f, 14.6196f, 21.3842f)
        lineTo(17.9507f, 18.0354f)
        moveTo(12.0352f, 12.0885f)
        lineTo(14.0318f, 10.0813f)
        curveTo(15.4067f, 8.69915f, 16.0941f, 8.00807f, 16.9454f, 8.00009f)
        curveTo(16.9583f, 7.99997f, 16.9712f, 7.99997f, 16.9842f, 8.00009f)
        curveTo(17.8355f, 8.00807f, 18.5229f, 8.69915f, 19.8978f, 10.0813f)
        curveTo(21.2938f, 11.4848f, 21.9919f, 12.1865f, 21.9999f, 13.0598f)
        curveTo(22f, 13.073f, 22f, 13.0863f, 21.9999f, 13.0995f)
        curveTo(21.9919f, 13.9728f, 21.2938f, 14.6745f, 19.8978f, 16.078f)
        lineTo(17.9507f, 18.0354f)
        moveTo(12.0352f, 12.0885f)
        lineTo(17.9507f, 18.0354f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 9f)
        lineTo(7.5f, 5.5f)
        moveTo(7.5f, 5.5f)
        lineTo(6.18393f, 2.42917f)
        curveTo(6.1474f, 2.34393f, 6.12913f, 2.30131f, 6.10602f, 2.26511f)
        curveTo(6.01746f, 2.12637f, 5.86628f, 2.0315f, 5.69393f, 2.00652f)
        curveTo(5.64897f, 2f, 5.59931f, 2f, 5.5f, 2f)
        curveTo(5.40069f, 2f, 5.35103f, 2f, 5.30607f, 2.00652f)
        curveTo(5.13372f, 2.0315f, 4.98254f, 2.12637f, 4.89398f, 2.26511f)
        curveTo(4.87087f, 2.30131f, 4.8526f, 2.34393f, 4.81607f, 2.42917f)
        lineTo(3.5f, 5.5f)
        moveTo(7.5f, 5.5f)
        lineTo(3.5f, 5.5f)
        moveTo(3.5f, 5.5f)
        lineTo(2f, 9f)
        }
        }.build()

        return _eraserAuto!!
    }

private var _eraserAuto: ImageVector? = null
