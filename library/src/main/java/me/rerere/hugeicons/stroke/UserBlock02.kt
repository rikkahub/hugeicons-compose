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

val HugeIcons.UserBlock02: ImageVector
    get() {
        if (_userBlock02 != null) {
            return _userBlock02!!
        }
        _userBlock02 = ImageVector.Builder(
            name = "UserBlock02",
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
            moveTo(14f, 7f)
            arcTo(4f, 4f, 0f, true, false, 6f, 7f)
            arcTo(4f, 4f, 0f, true, false, 14f, 7f)
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
            moveTo(10f, 14f)
            curveTo(5f, 14f, 2f, 16.5f, 2f, 19f)
            curveTo(2f, 20.1046f, 2.89543f, 21f, 4f, 21f)
            horizontalLineTo(16f)
            curveTo(17.1046f, 21f, 18f, 20.1046f, 18f, 19f)
            curveTo(18f, 16.5f, 15f, 14f, 10f, 14f)
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
            moveTo(21.0398f, 8.96016f)
            lineTo(17.4762f, 12.5238f)
            moveTo(22f, 10.75f)
            curveTo(22f, 12.2688f, 20.7688f, 13.5f, 19.25f, 13.5f)
            curveTo(17.7312f, 13.5f, 16.5f, 12.2688f, 16.5f, 10.75f)
            curveTo(16.5f, 9.23122f, 17.7312f, 8f, 19.25f, 8f)
            curveTo(20.7688f, 8f, 22f, 9.23122f, 22f, 10.75f)
            close()
        }
        }.build()

        return _userBlock02!!
    }

private var _userBlock02: ImageVector? = null
