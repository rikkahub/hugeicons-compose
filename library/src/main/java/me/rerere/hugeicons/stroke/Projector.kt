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

val HugeIcons.Projector: ImageVector
    get() {
        if (_projector != null) {
            return _projector!!
        }
        _projector = ImageVector.Builder(
            name = "Projector",
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
            moveTo(18f, 12.5f)
            curveTo(18f, 14.7091f, 16.2091f, 16.5f, 14f, 16.5f)
            curveTo(11.7909f, 16.5f, 10f, 14.7091f, 10f, 12.5f)
            curveTo(10f, 10.2909f, 11.7909f, 8.5f, 14f, 8.5f)
            curveTo(16.2091f, 8.5f, 18f, 10.2909f, 18f, 12.5f)
            close()
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
            moveTo(5f, 17.5f)
            horizontalLineTo(7f)
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
            moveTo(10f, 10.5f)
            horizontalLineTo(7f)
            curveTo(5.13077f, 10.5f, 4.19615f, 10.5f, 3.5f, 10.9019f)
            curveTo(3.04394f, 11.1652f, 2.66523f, 11.5439f, 2.40192f, 12f)
            curveTo(2f, 12.6962f, 2f, 13.6308f, 2f, 15.5f)
            curveTo(2f, 17.3692f, 2f, 18.3038f, 2.40192f, 19f)
            curveTo(2.66523f, 19.4561f, 3.04394f, 19.8348f, 3.5f, 20.0981f)
            curveTo(4.19615f, 20.5f, 5.13077f, 20.5f, 7f, 20.5f)
            horizontalLineTo(17f)
            curveTo(18.8692f, 20.5f, 19.8038f, 20.5f, 20.5f, 20.0981f)
            curveTo(20.9561f, 19.8348f, 21.3348f, 19.4561f, 21.5981f, 19f)
            curveTo(22f, 18.3038f, 22f, 17.3692f, 22f, 15.5f)
            verticalLineTo(14.5f)
            curveTo(22f, 13.57f, 22f, 13.105f, 21.8978f, 12.7235f)
            curveTo(21.6204f, 11.6883f, 20.8117f, 10.8796f, 19.7765f, 10.6022f)
            curveTo(19.395f, 10.5f, 18.93f, 10.5f, 18f, 10.5f)
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
            moveTo(14.002f, 3.5f)
            verticalLineTo(5.49747f)
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
            moveTo(19.5f, 5f)
            lineTo(18f, 6.5f)
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
            moveTo(8.5f, 5f)
            lineTo(10f, 6.5f)
        }
        }.build()

        return _projector!!
    }

private var _projector: ImageVector? = null
