package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Search02: ImageVector
    get() {
        if (_search02 != null) {
            return _search02!!
        }
        _search02 = ImageVector.Builder(
            name = "Search02",
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
        moveTo(15f, 15f)
        lineTo(16.5f, 16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.9333f, 19.0252f)
        curveTo(16.3556f, 18.4475f, 16.3556f, 17.5109f, 16.9333f, 16.9333f)
        curveTo(17.5109f, 16.3556f, 18.4475f, 16.3556f, 19.0252f, 16.9333f)
        lineTo(21.0667f, 18.9748f)
        curveTo(21.6444f, 19.5525f, 21.6444f, 20.4891f, 21.0667f, 21.0667f)
        curveTo(20.4891f, 21.6444f, 19.5525f, 21.6444f, 18.9748f, 21.0667f)
        lineTo(16.9333f, 19.0252f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 9.5f)
        curveTo(16.5f, 5.63401f, 13.366f, 2.5f, 9.5f, 2.5f)
        curveTo(5.63401f, 2.5f, 2.5f, 5.63401f, 2.5f, 9.5f)
        curveTo(2.5f, 13.366f, 5.63401f, 16.5f, 9.5f, 16.5f)
        curveTo(13.366f, 16.5f, 16.5f, 13.366f, 16.5f, 9.5f)
        }
        }.build()

        return _search02!!
    }

private var _search02: ImageVector? = null
