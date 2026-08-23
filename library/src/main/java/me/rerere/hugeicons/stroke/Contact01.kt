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

val HugeIcons.Contact01: ImageVector
    get() {
        if (_contact01 != null) {
            return _contact01!!
        }
        _contact01 = ImageVector.Builder(
            name = "Contact01",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(8f, 2f)
            horizontalLineTo(17.5f)
            arcTo(4f, 4f, 0f, false, true, 21.5f, 6f)
            verticalLineTo(18f)
            arcTo(4f, 4f, 0f, false, true, 17.5f, 22f)
            horizontalLineTo(8f)
            arcTo(4f, 4f, 0f, false, true, 4f, 18f)
            verticalLineTo(6f)
            arcTo(4f, 4f, 0f, false, true, 8f, 2f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(10.59f, 13.7408f)
            curveTo(9.96125f, 14.162f, 8.31261f, 15.0221f, 9.31674f, 16.0983f)
            curveTo(9.80725f, 16.624f, 10.3536f, 17f, 11.0404f, 17f)
            horizontalLineTo(14.9596f)
            curveTo(15.6464f, 17f, 16.1928f, 16.624f, 16.6833f, 16.0983f)
            curveTo(17.6874f, 15.0221f, 16.0388f, 14.162f, 15.41f, 13.7408f)
            curveTo(13.9355f, 12.7531f, 12.0645f, 12.7531f, 10.59f, 13.7408f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(15f, 9f)
            curveTo(15f, 10.1046f, 14.1046f, 11f, 13f, 11f)
            curveTo(11.8954f, 11f, 11f, 10.1046f, 11f, 9f)
            curveTo(11f, 7.89543f, 11.8954f, 7f, 13f, 7f)
            curveTo(14.1046f, 7f, 15f, 7.89543f, 15f, 9f)
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
            moveTo(5f, 6f)
            lineTo(2.5f, 6f)
            moveTo(5f, 12f)
            lineTo(2.5f, 12f)
            moveTo(5f, 18f)
            horizontalLineTo(2.5f)
        }
        }.build()

        return _contact01!!
    }

private var _contact01: ImageVector? = null
