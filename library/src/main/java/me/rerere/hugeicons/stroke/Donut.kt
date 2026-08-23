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

val HugeIcons.Donut: ImageVector
    get() {
        if (_donut != null) {
            return _donut!!
        }
        _donut = ImageVector.Builder(
            name = "Donut",
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
            moveTo(15f, 12f)
            arcTo(3f, 3f, 0f, true, false, 9f, 12f)
            arcTo(3f, 3f, 0f, true, false, 15f, 12f)
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
            moveTo(12f, 2f)
            curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
            curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
            curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
            curveTo(2f, 11.3389f, 2.06448f, 10.693f, 2.18717f, 10.0679f)
            curveTo(2.23327f, 9.83299f, 2.25632f, 9.71556f, 2.29108f, 9.62866f)
            curveTo(2.45182f, 9.22673f, 2.60865f, 9.09769f, 3.03401f, 9.01737f)
            curveTo(3.12598f, 9f, 3.41732f, 9f, 4f, 9f)
            curveTo(5.31297f, 9f, 6.42895f, 8.15653f, 6.83563f, 6.98189f)
            curveTo(7.00941f, 6.47995f, 7.0963f, 6.22897f, 7.19132f, 6.14297f)
            curveTo(7.28634f, 6.05696f, 7.52149f, 6.00096f, 7.99178f, 5.88896f)
            curveTo(9.16127f, 5.61045f, 10f, 4.80929f, 10f, 3.5f)
            curveTo(10f, 3.14697f, 10f, 2.97046f, 10.0133f, 2.88974f)
            curveTo(10.0842f, 2.45918f, 10.3323f, 2.18934f, 10.7555f, 2.08263f)
            curveTo(10.8348f, 2.06263f, 10.9439f, 2.05346f, 11.1622f, 2.03512f)
            curveTo(11.4384f, 2.01192f, 11.7178f, 2f, 12f, 2f)
            close()
        }
        }.build()

        return _donut!!
    }

private var _donut: ImageVector? = null
