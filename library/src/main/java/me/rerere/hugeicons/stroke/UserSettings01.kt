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

val HugeIcons.UserSettings01: ImageVector
    get() {
        if (_userSettings01 != null) {
            return _userSettings01!!
        }
        _userSettings01 = ImageVector.Builder(
            name = "UserSettings01",
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
            moveTo(11f, 13.5f)
            curveTo(10.6446f, 13.5097f, 10.3134f, 13.5226f, 10.0008f, 13.5379f)
            curveTo(6.3f, 13.7193f, 3.28417f, 16.8058f, 3f, 20.5002f)
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
            moveTo(19.6709f, 16.2593f)
            curveTo(19.8803f, 16.6249f, 20f, 17.0485f, 20f, 17.5f)
            curveTo(20f, 17.9514f, 19.8804f, 18.3749f, 19.671f, 18.7404f)
            curveTo(19.2402f, 19.493f, 18.4293f, 20f, 17.5f, 20f)
            moveTo(15.3291f, 16.2593f)
            curveTo(15.1197f, 16.6249f, 15f, 17.0485f, 15f, 17.5f)
            curveTo(15f, 17.9514f, 15.1196f, 18.3749f, 15.329f, 18.7404f)
            curveTo(15.7598f, 19.493f, 16.5707f, 20f, 17.5f, 20f)
            moveTo(17.5f, 20f)
            lineTo(17.5f, 21.5f)
            moveTo(17.5f, 15f)
            curveTo(18.4292f, 15f, 19.24f, 15.5069f, 19.6709f, 16.2593f)
            moveTo(17.5f, 15f)
            curveTo(16.5708f, 15f, 15.76f, 15.5069f, 15.3291f, 16.2593f)
            moveTo(17.5f, 15f)
            lineTo(17.5f, 13.5f)
            moveTo(21f, 15.4998f)
            lineTo(19.6709f, 16.2593f)
            moveTo(14f, 19.4998f)
            lineTo(15.329f, 18.7404f)
            moveTo(21f, 19.4998f)
            lineTo(19.671f, 18.7404f)
            moveTo(14f, 15.4998f)
            lineTo(15.3291f, 16.2593f)
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
            moveTo(15f, 6.5f)
            arcTo(4f, 4f, 0f, true, false, 7f, 6.5f)
            arcTo(4f, 4f, 0f, true, false, 15f, 6.5f)
            close()
        }
        }.build()

        return _userSettings01!!
    }

private var _userSettings01: ImageVector? = null
