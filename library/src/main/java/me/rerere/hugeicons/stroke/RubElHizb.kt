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
        moveTo(4.5f, 6.64286f)
        curveTo(4.5f, 5.6327f, 4.5f, 5.12763f, 4.81381f, 4.81381f)
        curveTo(5.12763f, 4.5f, 5.6327f, 4.5f, 6.64286f, 4.5f)
        horizontalLineTo(17.3571f)
        curveTo(18.3673f, 4.5f, 18.8724f, 4.5f, 19.1862f, 4.81381f)
        curveTo(19.5f, 5.12763f, 19.5f, 5.6327f, 19.5f, 6.64286f)
        verticalLineTo(17.3571f)
        curveTo(19.5f, 18.3673f, 19.5f, 18.8724f, 19.1862f, 19.1862f)
        curveTo(18.8724f, 19.5f, 18.3673f, 19.5f, 17.3571f, 19.5f)
        horizontalLineTo(6.64286f)
        curveTo(5.6327f, 19.5f, 5.12763f, 19.5f, 4.81381f, 19.1862f)
        curveTo(4.5f, 18.8724f, 4.5f, 18.3673f, 4.5f, 17.3571f)
        verticalLineTo(6.64286f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.509f, 3.05426f)
        curveTo(11.2119f, 2.35142f, 11.5633f, 2f, 12f, 2f)
        curveTo(12.4367f, 2f, 12.7881f, 2.35142f, 13.491f, 3.05427f)
        lineTo(20.9457f, 10.509f)
        curveTo(21.6486f, 11.2119f, 22f, 11.5633f, 22f, 12f)
        curveTo(22f, 12.4367f, 21.6486f, 12.7881f, 20.9457f, 13.491f)
        lineTo(13.491f, 20.9457f)
        curveTo(12.7881f, 21.6486f, 12.4367f, 22f, 12f, 22f)
        curveTo(11.5633f, 22f, 11.2119f, 21.6486f, 10.509f, 20.9457f)
        lineTo(3.05426f, 13.491f)
        curveTo(2.35142f, 12.7881f, 2f, 12.4367f, 2f, 12f)
        curveTo(2f, 11.5633f, 2.35142f, 11.2119f, 3.05427f, 10.509f)
        lineTo(10.509f, 3.05426f)
        }
        }.build()

        return _rubElHizb!!
    }

private var _rubElHizb: ImageVector? = null
