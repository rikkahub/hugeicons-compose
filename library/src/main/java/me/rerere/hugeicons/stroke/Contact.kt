package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Contact: ImageVector
    get() {
        if (_contact != null) {
            return _contact!!
        }
        _contact = ImageVector.Builder(
            name = "Contact",
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
        moveTo(12f, 22f)
        curveTo(7.99306f, 22f, 5.98959f, 22f, 4.7448f, 20.682f)
        curveTo(3.5f, 19.364f, 3.5f, 17.2426f, 3.5f, 13f)
        curveTo(3.5f, 8.75736f, 3.5f, 6.63604f, 4.7448f, 5.31802f)
        curveTo(5.98959f, 4f, 7.99306f, 4f, 12f, 4f)
        curveTo(16.0069f, 4f, 18.0104f, 4f, 19.2552f, 5.31802f)
        curveTo(20.5f, 6.63604f, 20.5f, 8.75736f, 20.5f, 13f)
        curveTo(20.5f, 17.2426f, 20.5f, 19.364f, 19.2552f, 20.682f)
        curveTo(18.0104f, 22f, 16.0069f, 22f, 12f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 4f)
        verticalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 4f)
        verticalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.018f, 9.49261f)
        curveTo(14.018f, 10.5972f, 13.1226f, 11.4926f, 12.0181f, 11.4926f)
        curveTo(10.9135f, 11.4926f, 10.0181f, 10.5972f, 10.0181f, 9.49261f)
        curveTo(10.0181f, 8.38808f, 10.9135f, 7.49268f, 12.0181f, 7.49268f)
        curveTo(13.1226f, 7.49268f, 14.018f, 8.38808f, 14.018f, 9.49261f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.06298f, 16.7161f)
        curveTo(9.12133f, 15.0868f, 10.802f, 14.4762f, 12.0181f, 14.4774f)
        curveTo(13.2341f, 14.4787f, 14.8656f, 15.0868f, 15.9239f, 16.7161f)
        curveTo(15.9923f, 16.8215f, 16.0112f, 16.9512f, 15.9494f, 17.0607f)
        curveTo(15.7019f, 17.4996f, 14.9334f, 18.3705f, 14.3784f, 18.4296f)
        curveTo(13.7406f, 18.4974f, 12.0723f, 18.5069f, 12.0194f, 18.5072f)
        curveTo(11.9664f, 18.5069f, 10.2466f, 18.4974f, 9.60851f, 18.4296f)
        curveTo(9.05345f, 18.3705f, 8.28496f, 17.4996f, 8.03745f, 17.0607f)
        curveTo(7.9757f, 16.9512f, 7.99456f, 16.8215f, 8.06298f, 16.7161f)
        }
        }.build()

        return _contact!!
    }

private var _contact: ImageVector? = null
