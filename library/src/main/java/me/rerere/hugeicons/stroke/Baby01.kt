package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Baby01: ImageVector
    get() {
        if (_baby01 != null) {
            return _baby01!!
        }
        _baby01 = ImageVector.Builder(
            name = "Baby01",
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
        moveTo(14f, 16f)
        curveTo(13.4271f, 16.6318f, 12.7395f, 17f, 12f, 17f)
        curveTo(11.2605f, 17f, 10.5729f, 16.6318f, 10f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 11.5f)
        curveTo(8.71357f, 11.1841f, 8.36974f, 11f, 8f, 11f)
        curveTo(7.63026f, 11f, 7.28643f, 11.1841f, 7f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 11.5f)
        curveTo(16.7136f, 11.1841f, 16.3697f, 11f, 16f, 11f)
        curveTo(15.6303f, 11f, 15.2864f, 11.1841f, 15f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        curveTo(10.3431f, 2f, 9f, 3.34315f, 9f, 5f)
        curveTo(9f, 6.65685f, 10.3431f, 8f, 12f, 8f)
        curveTo(12.7684f, 8f, 13.4692f, 7.71115f, 14f, 7.23611f)
        }
        }.build()

        return _baby01!!
    }

private var _baby01: ImageVector? = null
