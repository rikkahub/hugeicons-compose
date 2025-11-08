package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ThreeFinger04: ImageVector
    get() {
        if (_threeFinger04 != null) {
            return _threeFinger04!!
        }
        _threeFinger04 = ImageVector.Builder(
            name = "ThreeFinger04",
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
        moveTo(7.76591f, 13.9903f)
        verticalLineTo(5.98282f)
        curveTo(7.76412f, 5.15277f, 8.39407f, 4.48216f, 9.22412f, 4.48216f)
        curveTo(10.0529f, 4.48216f, 10.749f, 5.15727f, 10.749f, 5.98606f)
        moveTo(10.749f, 5.98606f)
        verticalLineTo(10.4816f)
        moveTo(10.749f, 5.98606f)
        verticalLineTo(3.99859f)
        curveTo(10.749f, 3.16979f, 11.4208f, 2.49792f, 12.2496f, 2.49792f)
        curveTo(13.0797f, 2.49792f, 13.7521f, 3.17177f, 13.7503f, 4.00183f)
        verticalLineTo(10.475f)
        moveTo(16.7516f, 11.478f)
        verticalLineTo(5.98606f)
        curveTo(16.7534f, 5.156f, 16.081f, 4.48216f, 15.251f, 4.48216f)
        curveTo(14.4222f, 4.48216f, 13.7503f, 5.15403f, 13.7503f, 5.98282f)
        moveTo(16.7516f, 9.62564f)
        curveTo(17.5582f, 9.50466f, 19.5438f, 9.62564f, 19.7467f, 11.4827f)
        verticalLineTo(15.1446f)
        curveTo(19.7467f, 16.5054f, 19.8503f, 18.1424f, 18.6843f, 19.5346f)
        curveTo(17.9847f, 20.5756f, 16.4906f, 21.1453f, 16.4906f, 21.1453f)
        curveTo(14.9507f, 21.6538f, 13.5566f, 21.4484f, 12.6442f, 21.4816f)
        curveTo(11.6085f, 21.5194f, 10.9f, 21.5229f, 10.032f, 21.3303f)
        curveTo(10.032f, 21.3303f, 8.05237f, 20.9925f, 6.79365f, 18.8653f)
        curveTo(5.82699f, 17.2316f, 3.31365f, 14.9309f, 4.61865f, 12.8526f)
        curveTo(5.46058f, 11.5118f, 7.1236f, 10.0449f, 7.76591f, 9.48386f)
        }
        }.build()

        return _threeFinger04!!
    }

private var _threeFinger04: ImageVector? = null
