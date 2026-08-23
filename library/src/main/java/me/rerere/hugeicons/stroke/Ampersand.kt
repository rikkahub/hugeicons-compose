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

val HugeIcons.Ampersand: ImageVector
    get() {
        if (_ampersand != null) {
            return _ampersand!!
        }
        _ampersand = ImageVector.Builder(
            name = "Ampersand",
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
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(18.5f, 14.1816f)
            lineTo(15.6128f, 17.0494f)
            moveTo(15.6128f, 17.0494f)
            lineTo(12.906f, 19.7379f)
            curveTo(11.2118f, 21.4207f, 8.4649f, 21.4207f, 6.77067f, 19.7379f)
            curveTo(5.07644f, 18.0551f, 5.07644f, 15.3267f, 6.77067f, 13.6439f)
            lineTo(9.47744f, 10.9553f)
            moveTo(15.6128f, 17.0494f)
            lineTo(9.47744f, 10.9553f)
            moveTo(15.6128f, 17.0494f)
            lineTo(18.5f, 19.9171f)
            moveTo(9.47744f, 10.9553f)
            lineTo(11.8233f, 8.62527f)
            curveTo(13.1189f, 7.33841f, 13.1189f, 5.252f, 11.8233f, 3.96514f)
            curveTo(10.5277f, 2.67829f, 8.42716f, 2.67829f, 7.13157f, 3.96514f)
            curveTo(5.83599f, 5.252f, 5.83599f, 7.33841f, 7.13157f, 8.62527f)
            lineTo(9.47744f, 10.9553f)
            close()
        }
        }.build()

        return _ampersand!!
    }

private var _ampersand: ImageVector? = null
