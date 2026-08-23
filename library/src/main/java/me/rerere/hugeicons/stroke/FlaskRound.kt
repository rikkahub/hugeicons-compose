package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FlaskRound: ImageVector
    get() {
        if (_flaskRound != null) {
            return _flaskRound!!
        }
        _flaskRound = ImageVector.Builder(
            name = "FlaskRound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(8f, 2f)
            horizontalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(9.5f, 2f)
            verticalLineTo(6.05824f)
            curveTo(9.5f, 6.68785f, 9.5f, 7.00266f, 9.36866f, 7.23296f)
            curveTo(9.23732f, 7.46325f, 8.90463f, 7.66006f, 8.23925f, 8.05367f)
            curveTo(6.02726f, 9.36221f, 4.5f, 11.7594f, 4.5f, 14.5f)
            curveTo(4.5f, 18.6421f, 7.85786f, 22f, 12f, 22f)
            curveTo(16.1421f, 22f, 19.5f, 18.6421f, 19.5f, 14.5f)
            curveTo(19.5f, 11.7594f, 17.9727f, 9.36221f, 15.7608f, 8.05368f)
            curveTo(15.0954f, 7.66006f, 14.7627f, 7.46325f, 14.6313f, 7.23296f)
            curveTo(14.5f, 7.00266f, 14.5f, 6.68785f, 14.5f, 6.05824f)
            verticalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(5f, 12.3247f)
            curveTo(5.81797f, 12.1279f, 6.69773f, 12f, 7.69231f, 12f)
            curveTo(10.9231f, 12f, 14.1538f, 15f, 17.3846f, 15f)
            curveTo(18.0043f, 15f, 18.5384f, 14.947f, 19f, 14.8557f)
        }
        }.build()

        return _flaskRound!!
    }

private var _flaskRound: ImageVector? = null
