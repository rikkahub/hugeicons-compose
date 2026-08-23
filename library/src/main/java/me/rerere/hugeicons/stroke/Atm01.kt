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

val HugeIcons.Atm01: ImageVector
    get() {
        if (_atm01 != null) {
            return _atm01!!
        }
        _atm01 = ImageVector.Builder(
            name = "Atm01",
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
            moveTo(18f, 11f)
            curveTo(19.4001f, 11f, 20.1002f, 11f, 20.635f, 10.7275f)
            curveTo(21.1054f, 10.4878f, 21.4878f, 10.1054f, 21.7275f, 9.63498f)
            curveTo(22f, 9.1002f, 22f, 8.40013f, 22f, 7f)
            curveTo(22f, 5.59987f, 22f, 4.8998f, 21.7275f, 4.36502f)
            curveTo(21.4878f, 3.89462f, 21.1054f, 3.51217f, 20.635f, 3.27248f)
            curveTo(20.1002f, 3f, 19.4001f, 3f, 18f, 3f)
            horizontalLineTo(6f)
            curveTo(4.59987f, 3f, 3.8998f, 3f, 3.36502f, 3.27248f)
            curveTo(2.89462f, 3.51217f, 2.51217f, 3.89462f, 2.27248f, 4.36502f)
            curveTo(2f, 4.8998f, 2f, 5.59987f, 2f, 7f)
            curveTo(2f, 8.40013f, 2f, 9.1002f, 2.27248f, 9.63498f)
            curveTo(2.51217f, 10.1054f, 2.89462f, 10.4878f, 3.36502f, 10.7275f)
            curveTo(3.8998f, 11f, 4.59987f, 11f, 6f, 11f)
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
            moveTo(5f, 7f)
            horizontalLineTo(19f)
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
            moveTo(18f, 7f)
            horizontalLineTo(6f)
            verticalLineTo(15f)
            curveTo(6f, 17.8284f, 6f, 19.2426f, 6.87868f, 20.1213f)
            curveTo(7.75736f, 21f, 9.17157f, 21f, 12f, 21f)
            curveTo(14.8284f, 21f, 16.2426f, 21f, 17.1213f, 20.1213f)
            curveTo(18f, 19.2426f, 18f, 17.8284f, 18f, 15f)
            verticalLineTo(7f)
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
            moveTo(14f, 11.5f)
            horizontalLineTo(11f)
            curveTo(10.4477f, 11.5f, 10f, 11.9477f, 10f, 12.5f)
            verticalLineTo(13f)
            curveTo(10f, 13.5523f, 10.4477f, 14f, 11f, 14f)
            horizontalLineTo(13f)
            curveTo(13.5523f, 14f, 14f, 14.4477f, 14f, 15f)
            verticalLineTo(15.5f)
            curveTo(14f, 16.0523f, 13.5523f, 16.5f, 13f, 16.5f)
            horizontalLineTo(10f)
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
            moveTo(12f, 11.5f)
            verticalLineTo(10f)
            moveTo(12f, 16.5f)
            verticalLineTo(18f)
        }
        }.build()

        return _atm01!!
    }

private var _atm01: ImageVector? = null
