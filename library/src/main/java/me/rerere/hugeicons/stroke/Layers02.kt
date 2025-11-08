package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Layers02: ImageVector
    get() {
        if (_layers02 != null) {
            return _layers02!!
        }
        _layers02 = ImageVector.Builder(
            name = "Layers02",
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
        moveTo(11f, 6.50049f)
        curveTo(8.97247f, 6.50414f, 7.91075f, 6.55392f, 7.23223f, 7.23243f)
        curveTo(6.5f, 7.96467f, 6.5f, 9.14318f, 6.5f, 11.5002f)
        verticalLineTo(12.5002f)
        curveTo(6.5f, 14.8572f, 6.5f, 16.0357f, 7.23223f, 16.768f)
        curveTo(7.96447f, 17.5002f, 9.14298f, 17.5002f, 11.5f, 17.5002f)
        horizontalLineTo(12.5f)
        curveTo(14.857f, 17.5002f, 16.0355f, 17.5002f, 16.7678f, 16.768f)
        curveTo(17.4463f, 16.0895f, 17.4961f, 15.0277f, 17.4997f, 13.0002f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 11.0005f)
        curveTo(4.47247f, 11.0041f, 3.41075f, 11.0539f, 2.73223f, 11.7324f)
        curveTo(2f, 12.4647f, 2f, 13.6432f, 2f, 16.0002f)
        verticalLineTo(17.0002f)
        curveTo(2f, 19.3572f, 2f, 20.5357f, 2.73223f, 21.268f)
        curveTo(3.46447f, 22.0002f, 4.64298f, 22.0002f, 7f, 22.0002f)
        horizontalLineTo(8f)
        curveTo(10.357f, 22.0002f, 11.5355f, 22.0002f, 12.2678f, 21.268f)
        curveTo(12.9463f, 20.5895f, 12.9961f, 19.5277f, 12.9997f, 17.5002f)
        }
        }.build()

        return _layers02!!
    }

private var _layers02: ImageVector? = null
