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

val HugeIcons.Lasso: ImageVector
    get() {
        if (_lasso != null) {
            return _lasso!!
        }
        _lasso = ImageVector.Builder(
            name = "Lasso",
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
            moveTo(6.99609f, 9.5f)
            curveTo(6.99609f, 8.67157f, 7.66767f, 8f, 8.49609f, 8f)
            curveTo(9.32452f, 8f, 9.99609f, 8.67157f, 9.99609f, 9.5f)
            moveTo(13.9961f, 9.5f)
            curveTo(13.9961f, 8.67157f, 14.6677f, 8f, 15.4961f, 8f)
            curveTo(16.3245f, 8f, 16.9961f, 8.67157f, 16.9961f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(13.995f, 14f)
            curveTo(14.9572f, 14f, 15.4383f, 14f, 15.7288f, 14.4902f)
            curveTo(16.0193f, 14.9804f, 15.8482f, 15.2929f, 15.506f, 15.9179f)
            curveTo(14.8268f, 17.1587f, 13.5091f, 18f, 11.995f, 18f)
            curveTo(10.4808f, 18f, 9.16308f, 17.1587f, 8.48389f, 15.9179f)
            curveTo(8.14173f, 15.2929f, 7.97065f, 14.9804f, 8.26114f, 14.4902f)
            curveTo(8.55163f, 14f, 9.03274f, 14f, 9.99495f, 14f)
            horizontalLineTo(13.995f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(21.9961f, 12f)
            arcTo(10f, 10f, 0f, true, false, 1.9961000000000002f, 12f)
            arcTo(10f, 10f, 0f, true, false, 21.9961f, 12f)
            close()
        }
        }.build()

        return _lasso!!
    }

private var _lasso: ImageVector? = null
