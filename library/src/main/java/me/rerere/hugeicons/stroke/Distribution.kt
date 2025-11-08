package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Distribution: ImageVector
    get() {
        if (_distribution != null) {
            return _distribution!!
        }
        _distribution = ImageVector.Builder(
            name = "Distribution",
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
        moveTo(4.5f, 10.2653f)
        verticalLineTo(6f)
        horizontalLineTo(19.5f)
        verticalLineTo(10.2653f)
        curveTo(19.5f, 13.4401f, 19.5f, 15.0275f, 18.5237f, 16.0137f)
        curveTo(17.5474f, 17f, 15.976f, 17f, 12.8333f, 17f)
        horizontalLineTo(11.1667f)
        curveTo(8.02397f, 17f, 6.45262f, 17f, 5.47631f, 16.0137f)
        curveTo(4.5f, 15.0275f, 4.5f, 13.4401f, 4.5f, 10.2653f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.5f, 6f)
        lineTo(5.22115f, 4.46154f)
        curveTo(5.78045f, 3.26838f, 6.06009f, 2.6718f, 6.62692f, 2.3359f)
        curveTo(7.19375f, 2f, 7.92084f, 2f, 9.375f, 2f)
        horizontalLineTo(14.625f)
        curveTo(16.0792f, 2f, 16.8062f, 2f, 17.3731f, 2.3359f)
        curveTo(17.9399f, 2.6718f, 18.2196f, 3.26838f, 18.7788f, 4.46154f)
        lineTo(19.5f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 9f)
        horizontalLineTo(13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 22f)
        horizontalLineTo(12f)
        moveTo(20f, 22f)
        horizontalLineTo(12f)
        moveTo(12f, 22f)
        verticalLineTo(19.5f)
        }
        }.build()

        return _distribution!!
    }

private var _distribution: ImageVector? = null
