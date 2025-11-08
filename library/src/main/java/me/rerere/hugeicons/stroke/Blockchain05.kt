package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Blockchain05: ImageVector
    get() {
        if (_blockchain05 != null) {
            return _blockchain05!!
        }
        _blockchain05 = ImageVector.Builder(
            name = "Blockchain05",
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
        moveTo(12f, 17f)
        curveTo(12.2269f, 17f, 12.4378f, 16.894f, 12.8595f, 16.682f)
        lineTo(16.2497f, 14.978f)
        curveTo(17.7499f, 14.224f, 18.5f, 13.847f, 18.5f, 13.25f)
        verticalLineTo(5.75f)
        moveTo(12f, 17f)
        curveTo(11.7731f, 17f, 11.5623f, 16.894f, 11.1405f, 16.682f)
        lineTo(7.75027f, 14.978f)
        curveTo(6.25009f, 14.224f, 5.5f, 13.847f, 5.5f, 13.25f)
        verticalLineTo(5.75f)
        moveTo(12f, 17f)
        verticalLineTo(9.5f)
        moveTo(18.5f, 5.75f)
        curveTo(18.5f, 5.15298f, 17.7499f, 4.77597f, 16.2497f, 4.02196f)
        lineTo(12.8595f, 2.31799f)
        curveTo(12.4377f, 2.106f, 12.2269f, 2f, 12f, 2f)
        curveTo(11.7731f, 2f, 11.5623f, 2.106f, 11.1405f, 2.31799f)
        lineTo(7.75027f, 4.02196f)
        curveTo(6.25009f, 4.77597f, 5.5f, 5.15298f, 5.5f, 5.75f)
        moveTo(18.5f, 5.75f)
        curveTo(18.5f, 6.34702f, 17.7499f, 6.72403f, 16.2497f, 7.47804f)
        lineTo(12.8595f, 9.18201f)
        curveTo(12.4377f, 9.394f, 12.2269f, 9.5f, 12f, 9.5f)
        moveTo(5.5f, 5.75f)
        curveTo(5.5f, 6.34702f, 6.25009f, 6.72403f, 7.75027f, 7.47804f)
        lineTo(11.1405f, 9.18201f)
        curveTo(11.5623f, 9.394f, 11.7731f, 9.5f, 12f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 20.75f)
        curveTo(10f, 20.0596f, 10.5596f, 19.5f, 11.25f, 19.5f)
        horizontalLineTo(12.75f)
        curveTo(13.4404f, 19.5f, 14f, 20.0596f, 14f, 20.75f)
        moveTo(10f, 20.75f)
        curveTo(10f, 21.4404f, 10.5596f, 22f, 11.25f, 22f)
        horizontalLineTo(12.75f)
        curveTo(13.4404f, 22f, 14f, 21.4404f, 14f, 20.75f)
        moveTo(10f, 20.75f)
        horizontalLineTo(5f)
        moveTo(14f, 20.75f)
        horizontalLineTo(19f)
        }
        }.build()

        return _blockchain05!!
    }

private var _blockchain05: ImageVector? = null
