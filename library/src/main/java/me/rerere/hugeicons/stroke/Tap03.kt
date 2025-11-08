package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Tap03: ImageVector
    get() {
        if (_tap03 != null) {
            return _tap03!!
        }
        _tap03 = ImageVector.Builder(
            name = "Tap03",
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
        moveTo(6.70235f, 13.1617f)
        lineTo(8.71072f, 14.8945f)
        verticalLineTo(6.15789f)
        curveTo(8.71072f, 5.24227f, 9.44813f, 4.5f, 10.3578f, 4.5f)
        curveTo(11.2674f, 4.5f, 12.0048f, 5.24226f, 12.0048f, 6.15789f)
        verticalLineTo(10.6314f)
        lineTo(14.817f, 11.0838f)
        curveTo(16.6321f, 11.3579f, 17.5397f, 11.4949f, 18.179f, 11.8804f)
        curveTo(19.235f, 12.5172f, 20f, 13.4735f, 20f, 14.8695f)
        curveTo(20f, 15.8419f, 19.7612f, 16.4942f, 19.1808f, 18.247f)
        curveTo(18.8125f, 19.3591f, 18.6284f, 19.9152f, 18.3281f, 20.3554f)
        curveTo(17.8337f, 21.0801f, 17.1043f, 21.6093f, 16.2649f, 21.8522f)
        curveTo(15.7551f, 21.9998f, 15.1728f, 21.9998f, 14.0081f, 21.9998f)
        horizontalLineTo(13.0209f)
        curveTo(11.4725f, 21.9998f, 10.6983f, 21.9998f, 10.0091f, 21.7138f)
        curveTo(9.88545f, 21.6625f, 9.76465f, 21.6046f, 9.64717f, 21.5404f)
        curveTo(8.99204f, 21.1823f, 8.50384f, 20.5775f, 7.52744f, 19.3679f)
        lineTo(4.3665f, 15.4519f)
        curveTo(3.88077f, 14.8501f, 3.87753f, 13.9889f, 4.35872f, 13.3835f)
        curveTo(4.93708f, 12.6557f, 5.99941f, 12.5552f, 6.70235f, 13.1617f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.3164f, 6f)
        curveTo(14.3164f, 3.79086f, 12.5255f, 2f, 10.3164f, 2f)
        curveTo(8.10727f, 2f, 6.31641f, 3.79086f, 6.31641f, 6f)
        }
        }.build()

        return _tap03!!
    }

private var _tap03: ImageVector? = null
