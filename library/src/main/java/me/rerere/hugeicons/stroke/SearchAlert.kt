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

val HugeIcons.SearchAlert: ImageVector
    get() {
        if (_searchAlert != null) {
            return _searchAlert!!
        }
        _searchAlert = ImageVector.Builder(
            name = "SearchAlert",
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
            moveTo(17.4922f, 17.5f)
            lineTo(21.9922f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(19.9922f, 11f)
            curveTo(19.9922f, 6.02944f, 15.9628f, 2f, 10.9922f, 2f)
            curveTo(6.02163f, 2f, 1.99219f, 6.02944f, 1.99219f, 11f)
            curveTo(1.99219f, 15.9706f, 6.02163f, 20f, 10.9922f, 20f)
            curveTo(15.9628f, 20f, 19.9922f, 15.9706f, 19.9922f, 11f)
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
            moveTo(10.9922f, 7f)
            lineTo(10.9922f, 11f)
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
            moveTo(11.1172f, 14.75f)
            lineTo(10.9922f, 14.75f)
            moveTo(11.2422f, 14.75f)
            curveTo(11.2422f, 14.8881f, 11.1303f, 15f, 10.9922f, 15f)
            curveTo(10.8541f, 15f, 10.7422f, 14.8881f, 10.7422f, 14.75f)
            curveTo(10.7422f, 14.6119f, 10.8541f, 14.5f, 10.9922f, 14.5f)
            curveTo(11.1303f, 14.5f, 11.2422f, 14.6119f, 11.2422f, 14.75f)
            close()
        }
        }.build()

        return _searchAlert!!
    }

private var _searchAlert: ImageVector? = null
