package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Vision: ImageVector
    get() {
        if (_vision != null) {
            return _vision!!
        }
        _vision = ImageVector.Builder(
            name = "Vision",
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
        moveTo(2.5f, 8.18677f)
        curveTo(2.60406f, 6.08705f, 2.91537f, 4.77792f, 3.84664f, 3.84664f)
        curveTo(4.77792f, 2.91537f, 6.08705f, 2.60406f, 8.18677f, 2.5f)
        moveTo(21.5f, 8.18677f)
        curveTo(21.3959f, 6.08705f, 21.0846f, 4.77792f, 20.1534f, 3.84664f)
        curveTo(19.2221f, 2.91537f, 17.9129f, 2.60406f, 15.8132f, 2.5f)
        moveTo(15.8132f, 21.5f)
        curveTo(17.9129f, 21.3959f, 19.2221f, 21.0846f, 20.1534f, 20.1534f)
        curveTo(21.0846f, 19.2221f, 21.3959f, 17.9129f, 21.5f, 15.8132f)
        moveTo(8.18676f, 21.5f)
        curveTo(6.08705f, 21.3959f, 4.77792f, 21.0846f, 3.84664f, 20.1534f)
        curveTo(2.91537f, 19.2221f, 2.60406f, 17.9129f, 2.5f, 15.8132f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.6352f, 11.3178f)
        curveTo(19.8784f, 11.6224f, 20f, 11.7746f, 20f, 12f)
        curveTo(20f, 12.2254f, 19.8784f, 12.3776f, 19.6352f, 12.6822f)
        curveTo(18.5423f, 14.0504f, 15.7514f, 17f, 12f, 17f)
        curveTo(8.24862f, 17f, 5.45768f, 14.0504f, 4.36483f, 12.6822f)
        curveTo(4.12161f, 12.3776f, 4f, 12.2254f, 4f, 12f)
        curveTo(4f, 11.7746f, 4.12161f, 11.6224f, 4.36483f, 11.3178f)
        curveTo(5.45768f, 9.9496f, 8.24862f, 7f, 12f, 7f)
        curveTo(15.7514f, 7f, 18.5423f, 9.9496f, 19.6352f, 11.3178f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 12f)
        curveTo(14f, 10.8954f, 13.1046f, 10f, 12f, 10f)
        curveTo(10.8954f, 10f, 10f, 10.8954f, 10f, 12f)
        curveTo(10f, 13.1046f, 10.8954f, 14f, 12f, 14f)
        curveTo(13.1046f, 14f, 14f, 13.1046f, 14f, 12f)
        }
        }.build()

        return _vision!!
    }

private var _vision: ImageVector? = null
