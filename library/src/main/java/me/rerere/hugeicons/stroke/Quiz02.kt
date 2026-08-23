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

val HugeIcons.Quiz02: ImageVector
    get() {
        if (_quiz02 != null) {
            return _quiz02!!
        }
        _quiz02 = ImageVector.Builder(
            name = "Quiz02",
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
            moveTo(17.2916f, 16f)
            curveTo(18.9525f, 14.5341f, 20f, 12.3894f, 20f, 10f)
            curveTo(20f, 5.58173f, 16.4182f, 2f, 12f, 2f)
            curveTo(7.58173f, 2f, 4f, 5.58173f, 4f, 10f)
            curveTo(4f, 12.3894f, 5.04751f, 14.5341f, 6.70836f, 16f)
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
            moveTo(12.0532f, 13.8996f)
            horizontalLineTo(12.0032f)
            moveTo(10f, 8f)
            curveTo(10f, 6.89544f, 10.8954f, 6f, 12f, 6f)
            curveTo(13.1046f, 6f, 14f, 6.89544f, 14f, 8f)
            curveTo(14f, 8.75709f, 13.5793f, 9.41593f, 12.959f, 9.75553f)
            curveTo(12.4745f, 10.0207f, 12f, 10.4477f, 12f, 11f)
            moveTo(12.1032f, 13.8996f)
            curveTo(12.1032f, 13.9548f, 12.0584f, 13.9996f, 12.0032f, 13.9996f)
            curveTo(11.948f, 13.9996f, 11.9032f, 13.9548f, 11.9032f, 13.8996f)
            curveTo(11.9032f, 13.8443f, 11.948f, 13.7996f, 12.0032f, 13.7996f)
            curveTo(12.0584f, 13.7996f, 12.1032f, 13.8443f, 12.1032f, 13.8996f)
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
            moveTo(8.5f, 19f)
            horizontalLineTo(15.5f)
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
            moveTo(10f, 22f)
            horizontalLineTo(14f)
        }
        }.build()

        return _quiz02!!
    }

private var _quiz02: ImageVector? = null
