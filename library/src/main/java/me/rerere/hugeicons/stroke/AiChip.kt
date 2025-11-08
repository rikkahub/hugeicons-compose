package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiChip: ImageVector
    get() {
        if (_aiChip != null) {
            return _aiChip!!
        }
        _aiChip = ImageVector.Builder(
            name = "AiChip",
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
        moveTo(18.8284f, 18.8284f)
        curveTo(17.6569f, 20f, 15.7712f, 20f, 12f, 20f)
        curveTo(8.22876f, 20f, 6.34315f, 20f, 5.17157f, 18.8284f)
        curveTo(4f, 17.6569f, 4f, 15.7712f, 4f, 12f)
        curveTo(4f, 8.22876f, 4f, 6.34315f, 5.17157f, 5.17157f)
        curveTo(6.34315f, 4f, 8.22876f, 4f, 12f, 4f)
        curveTo(15.7712f, 4f, 17.6569f, 4f, 18.8284f, 5.17157f)
        curveTo(20f, 6.34315f, 20f, 8.22876f, 20f, 12f)
        curveTo(20f, 15.7712f, 20f, 17.6569f, 18.8284f, 18.8284f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 2f)
        verticalLineTo(4f)
        moveTo(16f, 2f)
        verticalLineTo(4f)
        moveTo(12f, 2f)
        verticalLineTo(4f)
        moveTo(8f, 20f)
        verticalLineTo(22f)
        moveTo(12f, 20f)
        verticalLineTo(22f)
        moveTo(16f, 20f)
        verticalLineTo(22f)
        moveTo(22f, 16f)
        horizontalLineTo(20f)
        moveTo(4f, 8f)
        horizontalLineTo(2f)
        moveTo(4f, 16f)
        horizontalLineTo(2f)
        moveTo(4f, 12f)
        horizontalLineTo(2f)
        moveTo(22f, 8f)
        horizontalLineTo(20f)
        moveTo(22f, 12f)
        horizontalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.4802f, 7.86193f)
        curveTo(11.6587f, 7.37936f, 12.3413f, 7.37936f, 12.5198f, 7.86193f)
        lineTo(13.3202f, 10.0248f)
        curveTo(13.4325f, 10.3283f, 13.6717f, 10.5675f, 13.9752f, 10.6798f)
        lineTo(16.1381f, 11.4802f)
        curveTo(16.6206f, 11.6587f, 16.6206f, 12.3413f, 16.1381f, 12.5198f)
        lineTo(13.9752f, 13.3202f)
        curveTo(13.6717f, 13.4325f, 13.4325f, 13.6717f, 13.3202f, 13.9752f)
        lineTo(12.5198f, 16.1381f)
        curveTo(12.3413f, 16.6206f, 11.6587f, 16.6206f, 11.4802f, 16.1381f)
        lineTo(10.6798f, 13.9752f)
        curveTo(10.5675f, 13.6717f, 10.3283f, 13.4325f, 10.0248f, 13.3202f)
        lineTo(7.86193f, 12.5198f)
        curveTo(7.37936f, 12.3413f, 7.37936f, 11.6587f, 7.86193f, 11.4802f)
        lineTo(10.0248f, 10.6798f)
        curveTo(10.3283f, 10.5675f, 10.5675f, 10.3283f, 10.6798f, 10.0248f)
        lineTo(11.4802f, 7.86193f)
        }
        }.build()

        return _aiChip!!
    }

private var _aiChip: ImageVector? = null
