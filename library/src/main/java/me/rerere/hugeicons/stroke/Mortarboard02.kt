package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Mortarboard02: ImageVector
    get() {
        if (_mortarboard02 != null) {
            return _mortarboard02!!
        }
        _mortarboard02 = ImageVector.Builder(
            name = "Mortarboard02",
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
        moveTo(2f, 8f)
        curveTo(2f, 9.34178f, 10.0949f, 13f, 11.9861f, 13f)
        curveTo(13.8772f, 13f, 21.9722f, 9.34178f, 21.9722f, 8f)
        curveTo(21.9722f, 6.65822f, 13.8772f, 3f, 11.9861f, 3f)
        curveTo(10.0949f, 3f, 2f, 6.65822f, 2f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.99414f, 11f)
        lineTo(6.23925f, 16.6299f)
        curveTo(6.24415f, 16.7426f, 6.25634f, 16.8555f, 6.28901f, 16.9635f)
        curveTo(6.38998f, 17.2973f, 6.57608f, 17.6006f, 6.86f, 17.8044f)
        curveTo(9.08146f, 19.3985f, 14.8901f, 19.3985f, 17.1115f, 17.8044f)
        curveTo(17.3956f, 17.6006f, 17.5816f, 17.2973f, 17.6826f, 16.9635f)
        curveTo(17.7152f, 16.8555f, 17.7274f, 16.7426f, 17.7324f, 16.6299f)
        lineTo(17.9774f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.4734f, 9.5f)
        verticalLineTo(16.5f)
        moveTo(20.4734f, 16.5f)
        curveTo(19.6814f, 17.9463f, 19.3312f, 18.7212f, 18.9755f, 20f)
        curveTo(18.8983f, 20.455f, 18.9596f, 20.6843f, 19.2732f, 20.8879f)
        curveTo(19.4006f, 20.9706f, 19.5537f, 21f, 19.7055f, 21f)
        horizontalLineTo(21.2259f)
        curveTo(21.3876f, 21f, 21.5507f, 20.9663f, 21.6838f, 20.8745f)
        curveTo(21.9753f, 20.6735f, 22.0503f, 20.453f, 21.9713f, 20f)
        curveTo(21.6595f, 18.8126f, 21.2623f, 18.0008f, 20.4734f, 16.5f)
        }
        }.build()

        return _mortarboard02!!
    }

private var _mortarboard02: ImageVector? = null
