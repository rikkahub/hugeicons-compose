package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Prism: ImageVector
    get() {
        if (_prism != null) {
            return _prism!!
        }
        _prism = ImageVector.Builder(
            name = "Prism",
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
        moveTo(12f, 15f)
        curveTo(12.3229f, 15f, 12.6069f, 15.2004f, 13.1749f, 15.6011f)
        lineTo(16.9191f, 18.2431f)
        curveTo(19.1042f, 19.7849f, 20.1967f, 20.5558f, 19.9708f, 21.2779f)
        moveTo(12f, 15f)
        curveTo(11.6771f, 15f, 11.3931f, 15.2004f, 10.8251f, 15.6011f)
        lineTo(7.08088f, 18.2431f)
        curveTo(4.89585f, 19.7849f, 3.80333f, 20.5558f, 4.02915f, 21.2779f)
        moveTo(12f, 15f)
        verticalLineTo(11.5f)
        moveTo(19.9708f, 21.2779f)
        curveTo(19.745f, 22f, 18.4114f, 22f, 15.7443f, 22f)
        horizontalLineTo(8.25573f)
        curveTo(5.58856f, 22f, 4.25498f, 22f, 4.02915f, 21.2779f)
        moveTo(19.9708f, 21.2779f)
        verticalLineTo(8f)
        moveTo(4.02915f, 21.2779f)
        verticalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        curveTo(12.3229f, 2f, 12.6069f, 2.20038f, 13.1749f, 2.60114f)
        lineTo(16.9191f, 5.24311f)
        curveTo(19.1042f, 6.78487f, 20.1967f, 7.55575f, 19.9708f, 8.27788f)
        curveTo(19.745f, 9f, 18.4114f, 9f, 15.7443f, 9f)
        horizontalLineTo(8.25573f)
        curveTo(5.58856f, 9f, 4.25498f, 9f, 4.02915f, 8.27788f)
        curveTo(3.80333f, 7.55575f, 4.89585f, 6.78487f, 7.08088f, 5.24311f)
        lineTo(10.8251f, 2.60114f)
        curveTo(11.3931f, 2.20038f, 11.6771f, 2f, 12f, 2f)
        moveTo(12f, 2f)
        verticalLineTo(6.5f)
        }
        }.build()

        return _prism!!
    }

private var _prism: ImageVector? = null
