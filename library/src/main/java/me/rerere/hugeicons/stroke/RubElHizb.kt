package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RubElHizb: ImageVector
    get() {
        if (_rubElHizb != null) {
            return _rubElHizb!!
        }
        _rubElHizb = ImageVector.Builder(
            name = "RubElHizb",
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
        moveTo(5f, 6.64286f)
        curveTo(5f, 5.6327f, 5f, 5.12763f, 5.31381f, 4.81381f)
        curveTo(5.62763f, 4.5f, 6.1327f, 4.5f, 7.14286f, 4.5f)
        horizontalLineTo(17.8571f)
        curveTo(18.8673f, 4.5f, 19.3724f, 4.5f, 19.6862f, 4.81381f)
        curveTo(20f, 5.12763f, 20f, 5.6327f, 20f, 6.64286f)
        verticalLineTo(17.3571f)
        curveTo(20f, 18.3673f, 20f, 18.8724f, 19.6862f, 19.1862f)
        curveTo(19.3724f, 19.5f, 18.8673f, 19.5f, 17.8571f, 19.5f)
        horizontalLineTo(7.14286f)
        curveTo(6.1327f, 19.5f, 5.62763f, 19.5f, 5.31381f, 19.1862f)
        curveTo(5f, 18.8724f, 5f, 18.3673f, 5f, 17.3571f)
        verticalLineTo(6.64286f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.009f, 3.05426f)
        curveTo(11.7119f, 2.35142f, 12.0633f, 2f, 12.5f, 2f)
        curveTo(12.9367f, 2f, 13.2881f, 2.35142f, 13.991f, 3.05427f)
        lineTo(21.4457f, 10.509f)
        curveTo(22.1486f, 11.2119f, 22.5f, 11.5633f, 22.5f, 12f)
        curveTo(22.5f, 12.4367f, 22.1486f, 12.7881f, 21.4457f, 13.491f)
        lineTo(13.991f, 20.9457f)
        curveTo(13.2881f, 21.6486f, 12.9367f, 22f, 12.5f, 22f)
        curveTo(12.0633f, 22f, 11.7119f, 21.6486f, 11.009f, 20.9457f)
        lineTo(3.55426f, 13.491f)
        curveTo(2.85142f, 12.7881f, 2.5f, 12.4367f, 2.5f, 12f)
        curveTo(2.5f, 11.5633f, 2.85142f, 11.2119f, 3.55427f, 10.509f)
        lineTo(11.009f, 3.05426f)
        }
        }.build()

        return _rubElHizb!!
    }

private var _rubElHizb: ImageVector? = null
