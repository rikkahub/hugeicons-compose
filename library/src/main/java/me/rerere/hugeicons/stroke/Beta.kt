package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Beta: ImageVector
    get() {
        if (_beta != null) {
            return _beta!!
        }
        _beta = ImageVector.Builder(
            name = "Beta",
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
        moveTo(12.8831f, 10.2f)
        curveTo(15.1353f, 10.2f, 16.961f, 8.58822f, 16.961f, 6.6f)
        curveTo(16.961f, 4.61177f, 15.1353f, 3f, 12.8831f, 3f)
        curveTo(10.6309f, 3f, 8.80516f, 4.61177f, 8.80516f, 6.6f)
        verticalLineTo(19.2f)
        curveTo(8.80516f, 20.1941f, 7.89228f, 21f, 6.76619f, 21f)
        curveTo(6.01148f, 21f, 5.35255f, 20.638f, 5f, 20.1f)
        moveTo(8.80516f, 14.7f)
        curveTo(8.80516f, 17.1853f, 11.0874f, 19.2f, 13.9026f, 19.2f)
        curveTo(16.7178f, 19.2f, 19f, 17.1853f, 19f, 14.7f)
        curveTo(19f, 12.2147f, 16.7178f, 10.0866f, 13.9026f, 10.0866f)
        }
        }.build()

        return _beta!!
    }

private var _beta: ImageVector? = null
