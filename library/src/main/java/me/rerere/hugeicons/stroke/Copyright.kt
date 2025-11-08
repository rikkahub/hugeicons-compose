package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Copyright: ImageVector
    get() {
        if (_copyright != null) {
            return _copyright!!
        }
        _copyright = ImageVector.Builder(
            name = "Copyright",
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
        moveTo(22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 14f)
        curveTo(15f, 15.1046f, 14.1046f, 16f, 13f, 16f)
        horizontalLineTo(12f)
        curveTo(11.0681f, 16f, 10.6022f, 16f, 10.2346f, 15.8478f)
        curveTo(9.74458f, 15.6448f, 9.35523f, 15.2554f, 9.15224f, 14.7654f)
        curveTo(9f, 14.3978f, 9f, 13.9319f, 9f, 13f)
        verticalLineTo(11f)
        curveTo(9f, 10.0681f, 9f, 9.60218f, 9.15224f, 9.23463f)
        curveTo(9.35523f, 8.74458f, 9.74458f, 8.35523f, 10.2346f, 8.15224f)
        curveTo(10.6022f, 8f, 11.0681f, 8f, 12f, 8f)
        horizontalLineTo(13f)
        curveTo(14.1046f, 8f, 15f, 8.89543f, 15f, 10f)
        }
        }.build()

        return _copyright!!
    }

private var _copyright: ImageVector? = null
