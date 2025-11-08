package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Seo: ImageVector
    get() {
        if (_seo != null) {
            return _seo!!
        }
        _seo = ImageVector.Builder(
            name = "Seo",
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
        moveTo(5f, 20f)
        lineTo(7.41286f, 17.5871f)
        moveTo(7.41286f, 17.5871f)
        curveTo(8.21715f, 18.3914f, 9.32826f, 18.8889f, 10.5556f, 18.8889f)
        curveTo(13.0102f, 18.8889f, 15f, 16.899f, 15f, 14.4444f)
        curveTo(15f, 11.9898f, 13.0102f, 10f, 10.5556f, 10f)
        curveTo(8.10096f, 10f, 6.11111f, 11.9898f, 6.11111f, 14.4444f)
        curveTo(6.11111f, 15.6717f, 6.60857f, 16.7829f, 7.41286f, 17.5871f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 15.1877f)
        curveTo(2.36394f, 14.0914f, 2f, 12.8191f, 2f, 11.4623f)
        curveTo(2f, 7.34099f, 5.35786f, 4f, 9.5f, 4f)
        horizontalLineTo(14.5f)
        curveTo(18.6421f, 4f, 22f, 7.34099f, 22f, 11.4623f)
        curveTo(22f, 14.7114f, 19.913f, 17.4756f, 17f, 18.5f)
        }
        }.build()

        return _seo!!
    }

private var _seo: ImageVector? = null
