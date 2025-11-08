package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Ear: ImageVector
    get() {
        if (_ear != null) {
            return _ear!!
        }
        _ear = ImageVector.Builder(
            name = "Ear",
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
        moveTo(6.07692f, 18f)
        curveTo(6.07692f, 20.2091f, 7.226f, 22f, 9.30769f, 22f)
        curveTo(11.3894f, 22f, 13.0769f, 20.5f, 13.6154f, 18f)
        curveTo(13.8736f, 16.8013f, 14.4026f, 16.0767f, 15.2308f, 15.5f)
        curveTo(17.3846f, 14f, 19f, 11.6923f, 19f, 9f)
        curveTo(19f, 5.13401f, 15.866f, 2f, 12f, 2f)
        curveTo(8.13401f, 2f, 5f, 5.13401f, 5f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 15f)
        curveTo(10.385f, 15f, 11.5078f, 13.9926f, 11.5078f, 12.75f)
        curveTo(11.5078f, 11.5074f, 10.385f, 10.5f, 9f, 10.5f)
        curveTo(9f, 8.48311f, 9.46383f, 6f, 12.0094f, 6f)
        curveTo(13.7998f, 6f, 14.8496f, 7.37416f, 15f, 9.15f)
        }
        }.build()

        return _ear!!
    }

private var _ear: ImageVector? = null
