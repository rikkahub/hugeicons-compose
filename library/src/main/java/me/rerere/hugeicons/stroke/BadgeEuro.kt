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

val HugeIcons.BadgeEuro: ImageVector
    get() {
        if (_badgeEuro != null) {
            return _badgeEuro!!
        }
        _badgeEuro = ImageVector.Builder(
            name = "BadgeEuro",
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
            moveTo(14.3942f, 3.00083f)
            lineTo(14.1481f, 2.79115f)
            curveTo(12.9103f, 1.73628f, 11.0897f, 1.73628f, 9.85189f, 2.79115f)
            lineTo(9.60584f, 3.00083f)
            curveTo(8.96518f, 3.54679f, 8.16862f, 3.87674f, 7.32956f, 3.9437f)
            lineTo(7.00731f, 3.96941f)
            curveTo(5.38613f, 4.09878f, 4.09878f, 5.38613f, 3.96941f, 7.00731f)
            lineTo(3.9437f, 7.32956f)
            curveTo(3.87674f, 8.16862f, 3.54679f, 8.96518f, 3.00083f, 9.60584f)
            lineTo(2.79115f, 9.85189f)
            curveTo(1.73628f, 11.0897f, 1.73628f, 12.9103f, 2.79115f, 14.1481f)
            lineTo(3.00083f, 14.3942f)
            curveTo(3.54679f, 15.0348f, 3.87674f, 15.8314f, 3.9437f, 16.6704f)
            lineTo(3.96941f, 16.9927f)
            curveTo(4.09878f, 18.6139f, 5.38613f, 19.9012f, 7.00731f, 20.0306f)
            lineTo(7.32956f, 20.0563f)
            curveTo(8.16862f, 20.1233f, 8.96518f, 20.4532f, 9.60584f, 20.9992f)
            lineTo(9.85188f, 21.2089f)
            curveTo(11.0897f, 22.2637f, 12.9103f, 22.2637f, 14.1481f, 21.2089f)
            lineTo(14.3942f, 20.9992f)
            curveTo(15.0348f, 20.4532f, 15.8314f, 20.1233f, 16.6704f, 20.0563f)
            lineTo(16.9927f, 20.0306f)
            curveTo(18.6139f, 19.9012f, 19.9012f, 18.6139f, 20.0306f, 16.9927f)
            lineTo(20.0563f, 16.6704f)
            curveTo(20.1233f, 15.8314f, 20.4532f, 15.0348f, 20.9992f, 14.3942f)
            lineTo(21.2089f, 14.1481f)
            curveTo(22.2637f, 12.9103f, 22.2637f, 11.0897f, 21.2089f, 9.85188f)
            lineTo(20.9992f, 9.60584f)
            curveTo(20.4532f, 8.96518f, 20.1233f, 8.16862f, 20.0563f, 7.32956f)
            lineTo(20.0306f, 7.00731f)
            curveTo(19.9012f, 5.38613f, 18.6139f, 4.09878f, 16.9927f, 3.96941f)
            lineTo(16.6704f, 3.9437f)
            curveTo(15.8314f, 3.87674f, 15.0348f, 3.54679f, 14.3942f, 3.00083f)
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
            moveTo(14.5f, 9.5f)
            curveTo(14f, 8.5f, 13.1936f, 8f, 12.1056f, 8f)
            curveTo(10.6665f, 8f, 9.5f, 9.16655f, 9.5f, 10.6056f)
            verticalLineTo(13.3944f)
            curveTo(9.5f, 14.8335f, 10.6665f, 16f, 12.1056f, 16f)
            curveTo(13.1936f, 16f, 14f, 15.5f, 14.5f, 14.5f)
            moveTo(8f, 12f)
            horizontalLineTo(12.1056f)
        }
        }.build()

        return _badgeEuro!!
    }

private var _badgeEuro: ImageVector? = null
