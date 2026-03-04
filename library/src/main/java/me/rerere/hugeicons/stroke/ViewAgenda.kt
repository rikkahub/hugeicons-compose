package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ViewAgenda: ImageVector
    get() {
        if (_viewAgenda != null) {
            return _viewAgenda!!
        }
        _viewAgenda = ImageVector.Builder(
            name = "ViewAgenda",
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
        moveTo(17f, 10f)
        lineTo(7f, 10f)
        curveTo(6.06812f, 10f, 5.60218f, 10f, 5.23463f, 9.84776f)
        curveTo(4.74458f, 9.64477f, 4.35523f, 9.25542f, 4.15224f, 8.76537f)
        curveTo(4f, 8.39782f, 4f, 7.93188f, 4f, 7f)
        curveTo(4f, 6.06812f, 4f, 5.60218f, 4.15224f, 5.23463f)
        curveTo(4.35523f, 4.74458f, 4.74458f, 4.35523f, 5.23463f, 4.15224f)
        curveTo(5.60218f, 4f, 6.06812f, 4f, 7f, 4f)
        horizontalLineTo(17f)
        curveTo(17.9319f, 4f, 18.3978f, 4f, 18.7654f, 4.15224f)
        curveTo(19.2554f, 4.35523f, 19.6448f, 4.74458f, 19.8478f, 5.23463f)
        curveTo(20f, 5.60218f, 20f, 6.06812f, 20f, 7f)
        curveTo(20f, 7.93188f, 20f, 8.39783f, 19.8478f, 8.76537f)
        curveTo(19.6448f, 9.25542f, 19.2554f, 9.64477f, 18.7654f, 9.84776f)
        curveTo(18.3978f, 10f, 17.9319f, 10f, 17f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 20f)
        lineTo(7f, 20f)
        curveTo(6.06812f, 20f, 5.60218f, 20f, 5.23463f, 19.8478f)
        curveTo(4.74458f, 19.6448f, 4.35523f, 19.2554f, 4.15224f, 18.7654f)
        curveTo(4f, 18.3978f, 4f, 17.9319f, 4f, 17f)
        curveTo(4f, 16.0681f, 4f, 15.6022f, 4.15224f, 15.2346f)
        curveTo(4.35523f, 14.7446f, 4.74458f, 14.3552f, 5.23463f, 14.1522f)
        curveTo(5.60218f, 14f, 6.06812f, 14f, 7f, 14f)
        horizontalLineTo(17f)
        curveTo(17.9319f, 14f, 18.3978f, 14f, 18.7654f, 14.1522f)
        curveTo(19.2554f, 14.3552f, 19.6448f, 14.7446f, 19.8478f, 15.2346f)
        curveTo(20f, 15.6022f, 20f, 16.0681f, 20f, 17f)
        curveTo(20f, 17.9319f, 20f, 18.3978f, 19.8478f, 18.7654f)
        curveTo(19.6448f, 19.2554f, 19.2554f, 19.6448f, 18.7654f, 19.8478f)
        curveTo(18.3978f, 20f, 17.9319f, 20f, 17f, 20f)
        }
        }.build()

        return _viewAgenda!!
    }

private var _viewAgenda: ImageVector? = null
