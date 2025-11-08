package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Navigation04: ImageVector
    get() {
        if (_navigation04 != null) {
            return _navigation04!!
        }
        _navigation04 = ImageVector.Builder(
            name = "Navigation04",
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
        moveTo(15.7078f, 8.33055f)
        curveTo(16.6507f, 9.26482f, 15.1422f, 16.8628f, 13.5942f, 16.9967f)
        curveTo(12.2957f, 17.109f, 11.891f, 14.5478f, 11.6175f, 13.7361f)
        curveTo(11.3476f, 12.9349f, 11.0472f, 12.6465f, 10.2527f, 12.3836f)
        curveTo(8.23415f, 11.7159f, 7.22489f, 11.382f, 7.02507f, 10.8533f)
        curveTo(6.49595f, 9.45337f, 14.5036f, 7.13731f, 15.7078f, 8.33055f)
        }

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
        }.build()

        return _navigation04!!
    }

private var _navigation04: ImageVector? = null
