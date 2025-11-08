package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MenuCircle: ImageVector
    get() {
        if (_menuCircle != null) {
            return _menuCircle!!
        }
        _menuCircle = ImageVector.Builder(
            name = "MenuCircle",
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
        moveTo(10f, 6f)
        curveTo(10f, 3.79086f, 8.20914f, 2f, 6f, 2f)
        curveTo(3.79086f, 2f, 2f, 3.79086f, 2f, 6f)
        curveTo(2f, 8.20914f, 3.79086f, 10f, 6f, 10f)
        curveTo(8.20914f, 10f, 10f, 8.20914f, 10f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 18f)
        curveTo(10f, 15.7909f, 8.20914f, 14f, 6f, 14f)
        curveTo(3.79086f, 14f, 2f, 15.7909f, 2f, 18f)
        curveTo(2f, 20.2091f, 3.79086f, 22f, 6f, 22f)
        curveTo(8.20914f, 22f, 10f, 20.2091f, 10f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 6f)
        curveTo(22f, 3.79086f, 20.2091f, 2f, 18f, 2f)
        curveTo(15.7909f, 2f, 14f, 3.79086f, 14f, 6f)
        curveTo(14f, 8.20914f, 15.7909f, 10f, 18f, 10f)
        curveTo(20.2091f, 10f, 22f, 8.20914f, 22f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 18f)
        curveTo(22f, 15.7909f, 20.2091f, 14f, 18f, 14f)
        curveTo(15.7909f, 14f, 14f, 15.7909f, 14f, 18f)
        curveTo(14f, 20.2091f, 15.7909f, 22f, 18f, 22f)
        curveTo(20.2091f, 22f, 22f, 20.2091f, 22f, 18f)
        }
        }.build()

        return _menuCircle!!
    }

private var _menuCircle: ImageVector? = null
