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

val HugeIcons.TeamWork: ImageVector
    get() {
        if (_teamWork != null) {
            return _teamWork!!
        }
        _teamWork = ImageVector.Builder(
            name = "TeamWork",
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
            moveTo(7f, 2f)
            lineTo(8f, 4f)
            moveTo(11f, 2f)
            lineTo(10.5f, 3.5f)
            moveTo(4.5f, 5f)
            lineTo(6f, 5.5f)
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
            moveTo(10.5f, 15f)
            verticalLineTo(12.25f)
            curveTo(10.5f, 11.5596f, 11.0596f, 11f, 11.75f, 11f)
            curveTo(12.4404f, 11f, 13f, 11.5596f, 13f, 12.25f)
            verticalLineTo(18f)
            curveTo(13f, 20.2091f, 11.2091f, 22f, 9f, 22f)
            horizontalLineTo(8.23518f)
            curveTo(6.84614f, 22f, 5.55654f, 21.2794f, 4.82855f, 20.0964f)
            lineTo(2.17343f, 15.7818f)
            curveTo(2.06004f, 15.5976f, 2f, 15.3854f, 2f, 15.1691f)
            verticalLineTo(15.1111f)
            curveTo(2f, 14.4975f, 2.49746f, 14f, 3.11111f, 14f)
            curveTo(3.67068f, 14f, 4.19759f, 14.2635f, 4.53333f, 14.7111f)
            lineTo(5.5f, 16f)
            verticalLineTo(11.25f)
            curveTo(5.5f, 10.5596f, 6.05964f, 10f, 6.75f, 10f)
            curveTo(7.44036f, 10f, 8f, 10.5596f, 8f, 11.25f)
            verticalLineTo(15f)
            verticalLineTo(10.25f)
            curveTo(8f, 9.55964f, 8.55964f, 9f, 9.25f, 9f)
            curveTo(9.94036f, 9f, 10.5f, 9.55964f, 10.5f, 10.25f)
            verticalLineTo(15f)
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
            moveTo(11.5f, 6.24991f)
            curveTo(11.7089f, 6.09299f, 11.9686f, 6f, 12.25f, 6f)
            curveTo(12.9404f, 6f, 13.5f, 6.55964f, 13.5f, 7.25f)
            verticalLineTo(8.5f)
            verticalLineTo(5.25f)
            curveTo(13.5f, 4.55964f, 14.0596f, 4f, 14.75f, 4f)
            curveTo(15.4404f, 4f, 16f, 4.55964f, 16f, 5.25f)
            verticalLineTo(8.5f)
            verticalLineTo(6.25f)
            curveTo(16f, 5.55964f, 16.5596f, 5f, 17.25f, 5f)
            curveTo(17.9404f, 5f, 18.5f, 5.55964f, 18.5f, 6.25f)
            verticalLineTo(11f)
            lineTo(19.4667f, 9.71111f)
            curveTo(19.8024f, 9.26346f, 20.3293f, 9f, 20.8889f, 9f)
            curveTo(21.5025f, 9f, 22f, 9.49746f, 22f, 10.1111f)
            verticalLineTo(10.1691f)
            curveTo(22f, 10.3854f, 21.94f, 10.5976f, 21.8266f, 10.7818f)
            lineTo(19.1715f, 15.1645f)
            curveTo(18.574f, 16.1353f, 17.5984f, 16.7947f, 16.5f, 17f)
        }
        }.build()

        return _teamWork!!
    }

private var _teamWork: ImageVector? = null
