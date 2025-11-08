package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BedDouble: ImageVector
    get() {
        if (_bedDouble != null) {
            return _bedDouble!!
        }
        _bedDouble = ImageVector.Builder(
            name = "BedDouble",
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
        moveTo(22f, 17.5f)
        horizontalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 21f)
        verticalLineTo(16f)
        curveTo(22f, 14.1144f, 22f, 13.1716f, 21.4142f, 12.5858f)
        curveTo(20.8284f, 12f, 19.8856f, 12f, 18f, 12f)
        horizontalLineTo(6f)
        curveTo(4.11438f, 12f, 3.17157f, 12f, 2.58579f, 12.5858f)
        curveTo(2f, 13.1716f, 2f, 14.1144f, 2f, 16f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 12f)
        verticalLineTo(10.2134f)
        curveTo(11f, 9.83272f, 10.9428f, 9.70541f, 10.6497f, 9.55538f)
        curveTo(10.0395f, 9.24292f, 9.29865f, 9f, 8.5f, 9f)
        curveTo(7.70135f, 9f, 6.96055f, 9.24292f, 6.35025f, 9.55538f)
        curveTo(6.05721f, 9.70541f, 6f, 9.83272f, 6f, 10.2134f)
        lineTo(6f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 12f)
        verticalLineTo(10.2134f)
        curveTo(18f, 9.83272f, 17.9428f, 9.70541f, 17.6497f, 9.55538f)
        curveTo(17.0395f, 9.24292f, 16.2987f, 9f, 15.5f, 9f)
        curveTo(14.7013f, 9f, 13.9605f, 9.24292f, 13.3503f, 9.55538f)
        curveTo(13.0572f, 9.70541f, 13f, 9.83272f, 13f, 10.2134f)
        lineTo(13f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 12f)
        verticalLineTo(7.36057f)
        curveTo(21f, 6.66893f, 21f, 6.32311f, 20.8079f, 5.99653f)
        curveTo(20.6157f, 5.66995f, 20.342f, 5.50091f, 19.7944f, 5.16283f)
        curveTo(17.5869f, 3.79978f, 14.8993f, 3f, 12f, 3f)
        curveTo(9.10067f, 3f, 6.41314f, 3.79978f, 4.20558f, 5.16283f)
        curveTo(3.65804f, 5.50091f, 3.38427f, 5.66995f, 3.19213f, 5.99653f)
        curveTo(3f, 6.32311f, 3f, 6.66893f, 3f, 7.36057f)
        verticalLineTo(12f)
        }
        }.build()

        return _bedDouble!!
    }

private var _bedDouble: ImageVector? = null
