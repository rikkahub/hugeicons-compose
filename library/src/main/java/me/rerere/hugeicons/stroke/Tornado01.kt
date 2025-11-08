package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Tornado01: ImageVector
    get() {
        if (_tornado01 != null) {
            return _tornado01!!
        }
        _tornado01 = ImageVector.Builder(
            name = "Tornado01",
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
        moveTo(20f, 7f)
        curveTo(20f, 9.20914f, 16.4183f, 11f, 12f, 11f)
        curveTo(7.58172f, 11f, 4f, 9.20914f, 4f, 7f)
        curveTo(4f, 4.79086f, 7.58172f, 3f, 12f, 3f)
        curveTo(16.4183f, 3f, 20f, 4.79086f, 20f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 14f)
        curveTo(18f, 15.6569f, 15.3137f, 17f, 12f, 17f)
        curveTo(8.68629f, 17f, 6f, 15.6569f, 6f, 14f)
        curveTo(6f, 12.3431f, 8.68629f, 11f, 12f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 19f)
        curveTo(16f, 20.1046f, 14.2091f, 21f, 12f, 21f)
        curveTo(9.79086f, 21f, 8f, 20.1046f, 8f, 19f)
        curveTo(8f, 17.8954f, 9.79086f, 17f, 12f, 17f)
        }
        }.build()

        return _tornado01!!
    }

private var _tornado01: ImageVector? = null
