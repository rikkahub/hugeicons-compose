package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SearchCircle: ImageVector
    get() {
        if (_searchCircle != null) {
            return _searchCircle!!
        }
        _searchCircle = ImageVector.Builder(
            name = "SearchCircle",
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
        moveTo(22f, 12.0001f)
        curveTo(22f, 6.4772f, 17.5228f, 2.00005f, 12f, 2.00005f)
        curveTo(6.47715f, 2.00005f, 2f, 6.4772f, 2f, 12.0001f)
        curveTo(2f, 17.5229f, 6.47715f, 22.0001f, 12f, 22.0001f)
        curveTo(17.5228f, 22.0001f, 22f, 17.5229f, 22f, 12.0001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.8284f, 14.8285f)
        lineTo(17f, 17.0001f)
        moveTo(16f, 12.0001f)
        curveTo(16f, 9.79091f, 14.2091f, 8.00005f, 12f, 8.00005f)
        curveTo(9.79086f, 8.00005f, 8f, 9.79091f, 8f, 12.0001f)
        curveTo(8f, 14.2092f, 9.79086f, 16.0001f, 12f, 16.0001f)
        curveTo(14.2091f, 16.0001f, 16f, 14.2092f, 16f, 12.0001f)
        }
        }.build()

        return _searchCircle!!
    }

private var _searchCircle: ImageVector? = null
