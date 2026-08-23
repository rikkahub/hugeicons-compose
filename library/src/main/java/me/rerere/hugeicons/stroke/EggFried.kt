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

val HugeIcons.EggFried: ImageVector
    get() {
        if (_eggFried != null) {
            return _eggFried!!
        }
        _eggFried = ImageVector.Builder(
            name = "EggFried",
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
            moveTo(13f, 14f)
            arcTo(3f, 3f, 0f, true, false, 7f, 14f)
            arcTo(3f, 3f, 0f, true, false, 13f, 14f)
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
            moveTo(18.9999f, 8f)
            curveTo(18.9999f, 5.23858f, 16.7614f, 3f, 13.9999f, 3f)
            curveTo(12.3283f, 3f, 10.8486f, 3.82039f, 9.94099f, 5.08048f)
            curveTo(9.18334f, 6.13236f, 8.18419f, 7.11569f, 7.01211f, 7.66951f)
            curveTo(4.64065f, 8.79005f, 2.99994f, 11.2029f, 2.99994f, 14f)
            curveTo(2.99994f, 17.866f, 6.13395f, 21f, 9.99994f, 21f)
            curveTo(12.0336f, 21f, 13.8633f, 20.1319f, 15.1418f, 18.7468f)
            curveTo(15.609f, 18.2406f, 16.3111f, 18f, 16.9999f, 18f)
            curveTo(19.2091f, 18f, 20.9999f, 16.2091f, 20.9999f, 14f)
            curveTo(20.9999f, 13.1489f, 20.734f, 12.3603f, 20.2807f, 11.7122f)
            curveTo(19.5567f, 10.677f, 18.9999f, 9.26325f, 18.9999f, 8f)
            close()
        }
        }.build()

        return _eggFried!!
    }

private var _eggFried: ImageVector? = null
